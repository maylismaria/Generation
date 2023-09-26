CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_alunos(
id bigint auto_increment primary key,
nomeAluno varchar(255) not null,
responsavelLegal varchar(255) not null,
curso varchar(255) not null,
notaFinal decimal not null
);

INSERT INTO tb_alunos (nomeAluno, responsavelLegal,curso, notaFinal) VALUES ("Pedro Henrique Cardoso","Lucelia Lima Cardoso","Ensino médio", 5.5);
INSERT INTO tb_alunos (nomeAluno, responsavelLegal,curso, notaFinal) VALUES ("Lucas josé Costa","Maria Costa","Ensino médio", 7.5);
INSERT INTO tb_alunos (nomeAluno, responsavelLegal,curso, notaFinal) VALUES ("Kauam Bispo Lima","Marcia Bispo Lima","Ensino médio", 7.00);
INSERT INTO tb_alunos (nomeAluno, responsavelLegal,curso, notaFinal) VALUES ("Carlos Vieira Silva","Henrique Silva","Ensino médio", 9.5);
INSERT INTO tb_alunos (nomeAluno, responsavelLegal,curso, notaFinal) VALUES ("Maria Silva Costa","Marcelo Costa","Ensino médio", 6.5);
INSERT INTO tb_alunos (nomeAluno, responsavelLegal,curso, notaFinal) VALUES ("Marcela Oliveira Silva","Fernando Oliveira","Ensino médio", 5.5);
INSERT INTO tb_alunos (nomeAluno, responsavelLegal,curso, notaFinal) VALUES ("Luiza Costa Pereira","Luana Costa Pereira","Ensino médio", 9.5);
INSERT INTO tb_alunos (nomeAluno, responsavelLegal,curso, notaFinal) VALUES ("Henrique Cardoso","Lucinalda Bispo","Ensino médio", 10.0);

ALTER TABLE tb_alunos modify notaFinal decimal(6,2);
SELECT * FROM tb_alunos;

SELECT * FROM tb_alunos WHERE notaFinal < 7;
SELECT * FROM tb_alunos WHERE notaFinal > 7;

UPDATE tb_alunos SET notaFinal = 5 WHERE id = 8;
