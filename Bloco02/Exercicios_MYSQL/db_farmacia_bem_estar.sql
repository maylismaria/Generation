CREATE DATABASE db_farmacia_bem_estar;
USE db_farmacia_bem_estar;
CREATE TABLE tb_categorias(
id bigint auto_increment primary key,
nomeCategoria varchar(255),
descricaoCategoria varchar(255)
);
INSERT INTO  tb_categorias (nomeCategoria, descricaoCategoria) VALUES 
("HIGIENE", "Produtos de higiene pessoal "),
("MEDICAMENTOS", "Rémedios"),
("BELEZA", "Produtos de beleza"),
("SUPLEMENTOS", "Suplementos e vitaminas"),
("EQUIPAMENTOS MÉDICOS","Equipamentos médicos");

CREATE TABLE tb_produtos (
id bigint auto_increment primary key,
produto varchar(255) not null,
preco decimal not null,
descricao varchar(255) not null,
estoque varchar (255) not null,
categoria_id bigint not null
);
INSERT INTO tb_produtos (produto, preco, descricao, estoque, categoria_id) VALUES
	("DORALGINA", 10.00, "Analgésico e antipirético", 100, 2),
    ("Sabonete Neutro", 5.00, "Sabonete de uso diário", 200, 1),
    ("Multivitamínico A-Z", 52.00, "Suplemento vitamínico completo", 50, 4),
    ("Creme Facial Hidratante", 60.00, "Creme para hidratação da pele", 75, 3),
    ("Medidor de pressão", 100.00, "Medidor de pressão arterial", 30, 5),
	("Cinegripe", 5.00, "Antigripal", 30, 2),
    ('Termômetro Digital', 19.00, 'Termômetro para medição de temperatura', 30, 5),
	("Sabonete Neutro infantol", 10.00, "Sabonete de uso diário infantil", 200, 1);
    
ALTER TABLE tb_produtos ADD CONSTRAINT fk_produtos_categorias
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id);
SELECT * FROM tb_produtos WHERE preco > 50;
SELECT * FROM tb_produtos WHERE preco BETWEEN 5 AND 60;
SELECT *FROM tb_produtos WHERE produto LIKE "%c%";
SELECT produto,preco,descricao,estoque ,nomeCategoria,descricaoCategoria FROM tb_produtos
INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id;
SELECT produto,preco,descricao,estoque,nomeCategoria,descricaoCategoria FROM tb_produtos
INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id WHERE nomeCategoria in ("MEDICAMENTOS");
