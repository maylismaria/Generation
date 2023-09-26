CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(

id bigint auto_increment primary Key,
nomeProduto varchar(255) not null,
estoque int not null,
categoria varchar(255) not null,
preco decimal not null
);

INSERT INTO tb_produtos (nomeProduto,estoque,categoria,preco) values ("Cofre do Homem de Ferro", 10, "PRODUTOS GEEK: Marvel", 200.00);
INSERT INTO tb_produtos (nomeProduto,estoque,categoria,preco) values ("Caneca Homem Aranha", 20, "PRODUTOS GEEK: Marvel", 150.00);
INSERT INTO tb_produtos (nomeProduto,estoque,categoria,preco) values ("Camiseta Capitão América", 15, "PRODUTOS GEEK: Marvel", 250.00);
INSERT INTO tb_produtos (nomeProduto,estoque,categoria,preco) values ("Funko Homem Aranha", 10, "PRODUTOS GEEK: Marvel", 550.00);
INSERT INTO tb_produtos (nomeProduto,estoque,categoria,preco) values ("Livros de feitiços Harry Potter", 15, "PRODUTOS GEEK: Harry Potter", 300.00);
INSERT INTO tb_produtos (nomeProduto,estoque,categoria,preco) values ("Varinha mágica Harry Potter", 20, "PRODUTOS GEEK: Harry Potter", 350.00);
INSERT INTO tb_produtos (nomeProduto,estoque,categoria,preco) values ("Funko Harry Potter", 10, "PRODUTOS GEEK: Harry Potter", 600.00);
INSERT INTO tb_produtos (nomeProduto,estoque,categoria,preco) values ("Caneca Harry Potter", 20, "PRODUTOS GEEK: Harry Potter", 155.00);

SELECT * FROM tb_produtos;

ALTER TABLE tb_produtos modify preco decimal(6,2);

SELECT * FROM tb_produtos WHERE preco > 500;
SELECT * FROM tb_produtos WHERE preco < 500;

UPDATE tb_produtos SET estoque = 20 WHERE id = 5;
