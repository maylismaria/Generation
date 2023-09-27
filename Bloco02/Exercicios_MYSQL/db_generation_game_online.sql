create database db_generation_game_online;

use db_generation_game_online;

CREATE TABLE tb_classes(
id bigint auto_increment primary key,
nomeClasse varchar(255) not null,
habilidade varchar (255) not null
);

INSERT INTO tb_classes(nomeClasse,habilidade) VALUES 
("Mago", "Inteligência"),
("Arqueiro", "Precisão"),
("Bárbaro","Força"), 
("Druida","Conhecimento"),
("Curandeiro","Cura");

CREATE TABLE tb_personagens(
id bigint auto_increment primary key,
nomePersonagem varchar (255) not null,
poderAtaque INT,
poderDefesa INT,
pontosExperiencia int,
classe_id bigint
);

INSERT INTO tb_personagens (nomePersonagem,poderAtaque,poderDefesa,pontosExperiencia,classe_id) VALUES
 ("Morgana", 2500, 1800, 5000, 1),
 ("Claudinho", 1900, 1500, 3000,1),
 ("Lark", 2100, 1600, 3200,2),
 ("Harlok", 2000, 1500, 1000, 3),
 ("Nyssa", 1700, 900, 1000, 4),
 ("Caelan", 1000, 500, 800, 4),
 ("Ambrose", 3000, 2500, 1500,5),
 ("Caelia", 2400, 1500, 2000, 5);

ALTER TABLE tb_personagens ADD CONSTRAINT fk_personagens_classes
FOREIGN KEY (classe_id) REFERENCES tb_classes(id);

SELECT nomePersonagem,poderAtaque FROM tb_personagens WHERE poderAtaque > 2000;

SELECT nomePersonagem, poderDefesa FROM tb_personagens Where poderDefesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagens WHERE nomePersonagem  LIKE "%c%";

SELECT nomePersonagem, poderAtaque, poderDefesa, pontosExperiencia, nomeClasse, habilidade FROM tb_personagens 
INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classe_id;

SELECT nomePersonagem, poderAtaque,poderDefesa, pontosExperiencia, nomeClasse, habilidade FROM tb_personagens
INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classe_id WHERE nomeClasse in ("Druida");
