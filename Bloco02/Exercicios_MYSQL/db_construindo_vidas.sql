CREATE DATABASE db_construindo_vidas;
USE db_construindo_vidas;

CREATE TABLE tb_categorias(
id bigint auto_increment primary key,
nomeCategoria varchar(255),
descricaoCategoria varchar(255)
);

INSERT INTO  tb_categorias (nomeCategoria, descricaoCategoria) VALUES 
("TINTAS ", "Todas as cores de tinta"),
("ILUMINAÇÃO", "Produtos de iluminação"),
("ENCANAMENTO", "Diversos tipos de canos"),
("FERRAGENS", "Ferragens e utensílios"),
("MADEIRA", "Madeiras e produtos relacionados");

SELECT * FROM tb_categorias;

CREATE TABLE tb_produtos (
id bigint auto_increment primary key,
produto varchar(255) not null,
preco decimal not null,
descricao varchar(255),
estoque varchar (255) not null,
categoria_id bigint not null
);

INSERT INTO tb_produtos (produto, preco, estoque, categoria_id) VALUES
("Lâmpada LED 100W", 10.00 , 100, 2 ),
("Tinta branca", 30.00, 200, 1),
("Tinta rosa", 30.00, 100, 1),
("Lâmpada LED 60W", 15.00, 100, 3),
("TUBO PVC", 16.00 ,200, 3),
("COMPENSADO 3/4", 50.00, 50, 5),
("Furadeira", 300.00, 100, 4),
("Martelo pequeno", 45.00, 50, 4 );


ALTER TABLE tb_produtos ADD CONSTRAINT fk_produtos_categorias
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id);

SELECT * FROM tb_produtos WHERE preco > 100;

SELECT * FROM tb_produtos WHERE preco BETWEEN 70 AND 150;

SELECT *FROM tb_produtos WHERE produto LIKE "%c%";

SELECT produto,preco,estoque ,nomeCategoria,descricaoCategoria FROM tb_produtos
INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id;

SELECT produto,preco,descricao,estoque,nomeCategoria,descricaoCategoria FROM tb_produtos
INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id WHERE nomeCategoria in ("ENCANAMENTO");
	