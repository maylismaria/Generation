CREATE DATABASE db_empresa;

USE db_empresa;

CREATE TABLE tb_colaboradores(
id bigint auto_increment primary key,
nome varchar (255) not null,
cargo varchar (255) not null,
salario decimal not null,
dataAdmissao date not null 
);

INSERT INTO tb_colaboradores (nome,cargo,salario,dataAdmissao) values ("Maria Joana Pereira", "Auxiliar administrativo", 1200.00, "2018-05-01");
INSERT INTO tb_colaboradores (nome,cargo,salario,dataAdmissao) values ("José de Lima Costa", "Contador", 2700.00, "2015-10-20");
INSERT INTO tb_colaboradores (nome,cargo,salario,dataAdmissao) values ("Pedro Carapia Costa", "Estagiário", 1000.00, "2023-07-15");
INSERT INTO tb_colaboradores (nome,cargo,salario,dataAdmissao) values ("Luana Pereira Gonçalves", "Auxiliar de limpeza", 1100.00, "2022-12-02");
INSERT INTO tb_colaboradores (nome,cargo,salario,dataAdmissao) values ("Larissa Lima Silva", "Auxiliar de escritório", 1200.00, "2023-08-12");


SELECT * FROM tb_colaboradores;
SELECT * FROM tb_colaboradores where salario > 2000.00;
SELECT * FROM tb_colaboradores where salario < 2000.00;

UPDATE tb_colaboradores SET salario = 1700.00 WHERE id = 1;

