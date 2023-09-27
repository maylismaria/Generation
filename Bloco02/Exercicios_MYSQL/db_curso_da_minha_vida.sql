CREATE DATABASE db_curso_da_minha_vida;
USE db_curso_da_minha_vida;

CREATE TABLE tb_categorias(
id bigint auto_increment primary key,
nomeCategoria varchar(255),
descricaoCategoria varchar(255)
);

INSERT INTO  tb_categorias (nomeCategoria, descricaoCategoria) VALUES 
	("Programação", "Cursos de programação e desenvolvimento de software"),
    ("Design Gráfico", "Cursos de design gráfico"),
    ("Marketing Digital", "Cursos de marketing e estratégias digitais"),
    ("Línguas", "Cursos de idiomas"),
    ("Negócios", "Cursos de gestão e empreendedorismo");

SELECT * FROM tb_categorias;


CREATE TABLE tb_cursos (
id bigint auto_increment primary key,
nome_curso varchar(255) not null,
preco decimal not null,
descricao varchar(255),
nivel varchar (255) not null,
categoria_id bigint not null
);

INSERT INTO tb_cursos (nome_curso, preco, nivel, categoria_id) VALUES
    ("Introdução à Programação em Python", 200.00, "Iniciante", 1),
    ("Design de Logotipos Profissionais", 100.00, "Intermediário", 2),
    ("Estratégias de Marketing de Conteúdo", 150.00, "Intermediário", 3),
    ("Inglês Avançado: Conversação", 550.00, "Avançado", 4),
    ("Gestão de Projetos Empresariais", 100.00, "Iniciante", 5),
    ("Desenvolvimento Web ",  450.00, "Iniciante", 1),
    ("Photoshop Avançado: Retoques Profissionais", 250.00, "Avançado", 2),
    ("SEO e Estratégias de Link Building", 600.00, "Intermediário", 3);


ALTER TABLE tb_cursos ADD CONSTRAINT fk_cursos_categorias
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id);

SELECT * FROM tb_cursos WHERE preco > 500;

SELECT * FROM tb_cursos WHERE preco BETWEEN 600 AND 1000;

SELECT *FROM tb_cursos WHERE nome_curso LIKE "%j%";

SELECT nome_curso,preco,nivel ,nomeCategoria,descricaoCategoria FROM tb_cursos
INNER JOIN tb_categorias ON tb_categorias.id = tb_cursos.categoria_id;

SELECT nome_curso,preco,nivel ,nomeCategoria,descricaoCategoria FROM tb_cursos
INNER JOIN tb_categorias ON tb_categorias.id = tb_cursos.categoria_id WHERE nomeCategoria in ("Programação");
	