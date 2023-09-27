CREATE DATABASE cidade_dos_vegetais;
USE cidade_dos_vegetais;


CREATE TABLE tb_categorias(

id bigint auto_increment primary key,
nomeCategoria varchar(255),
descricaoCategoria varchar(255)
);

INSERT INTO  tb_categorias (nomeCategoria, descricaoCategoria) VALUES 
("FRUTA", "Frutas frescas"),
("LEGUMES", "Legumes frescos"),
("VERDURAS", "Verduras frescos"),
("ESPECIARIAS", "Especiarias e temperos"),
("ERVAS","Ervas para culinária");

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
("Banana", 5.00, 100, 1 ),
("Maçã", 10.00, 200, 1),
("Alface", 3.00, 100, 3),
("Brócolis", 6.00, 100, 3),
("Batata",5.00 ,200, 2),
("Colorau", 2.00, 50, 4),
("Cenoura", 6.00, 100, 3),
("Boldo Chileno", 63.00, 50, 5 );


	
ALTER TABLE tb_produtos ADD CONSTRAINT fk_produtos_categorias
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id);

SELECT * FROM tb_produtos WHERE preco > 50;

SELECT * FROM tb_produtos WHERE preco BETWEEN 50 AND 150;

SELECT *FROM tb_produtos WHERE produto LIKE "%c%";

SELECT produto,preco,estoque ,nomeCategoria,descricaoCategoria FROM tb_produtos
INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id;

SELECT produto,preco,descricao,estoque,nomeCategoria,descricaoCategoria FROM tb_produtos
INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id WHERE nomeCategoria in ("FRUTAS");
	