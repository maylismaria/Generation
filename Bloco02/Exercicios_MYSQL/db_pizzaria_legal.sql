CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;
CREATE TABLE tb_categorias(
id bigint auto_increment primary key,
nomeCategoria varchar(255),
descricaoCategoria varchar(255)
);
INSERT INTO  tb_categorias (nomeCategoria, descricaoCategoria) VALUES 
("TRADICIONAL", "Pizzas com ingredientes tradicionais "),
("VEGANA", "Pizzas 100% sem ingredientes de origem animal"),
("ESPECIAL", "Pizzas com ingredientes especiais da casa"),
("SEM LACTOSE", "Pizzas sem nenhum ingrediente que contenha lactose"),
("VEGETARIANA","Pizzas com ingredientes de origem vegana");

CREATE TABLE tb_pizzas (
id bigint auto_increment primary key,
sabor varchar(255) not null,
preco decimal not null,
descricao varchar(255) not null,
tamanho varchar (255) not null,
categoria_id bigint not null
);
INSERT INTO tb_pizzas (sabor, preco, descricao, tamanho, categoria_id) VALUES
("CALABRESA", 40.00, "A pizza contém nossa incrível massa coberta com calabresa", "MÉDIA", 1),
("MUSSARELA", 45.00, "A pizza contém nossa incrível massa coberta com mussarela", "MÉDIA", 1 ),
("LEGUMES", 55.00, "A pizza contém nossa incrível massa coberta com molho de tomate e legumes assados", "MÉDIA", 2 ),
("FRANGO COM CATUPIRY", 65.00, "A pizza contém nossa incrível massa coberta com mussarela, frango e catupiry", "MÉDIA", 3 ),
("A MODA DA CASA", 55.00, "A pizza contém nossa incrível massa coberta com queijo, frango, milho e batata palha", "MÉDIA", 5),
("FRANGO", 50.00, "A pizza contém nossa incrível massa coberta com frango e legumes ", "MÉDIA", 4 ),
("ESPINAFRE", 55.00, "A pizza contém nossa incrível massa coberta com molho de tomate, espinafre e legumes frescos", "MÉDIA", 2 ),
("A MODA DO CHEFE ", 80.00, "A pizza contém nossa incrível massa coberta com queijo, calabresa e catupiry", "MÉDIA", 3 );

ALTER TABLE tb_pizzas ADD CONSTRAINT fk_pizzas_categorias
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id);

SELECT * FROM tb_pizzas WHERE preco > 45;

SELECT * FROM tb_pizzas WHERE preco BETWEEN 50 AND 100;

SELECT *FROM tb_pizzas WHERE sabor LIKE "%m%";

SELECT sabor,preco,descricao,tamanho,nomeCategoria,descricaoCategoria FROM tb_pizzas
INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.categoria_id;

SELECT sabor,preco,descricao,tamanho,nomeCategoria,descricaoCategoria FROM tb_pizzas
INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.categoria_id WHERE nomeCategoria in ("TRADICIONAL");

