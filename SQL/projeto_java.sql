CREATE DATABASE projeto_java;
USE projeto_java;

CREATE TABLE usuario (
	user_id BIGINT (10) AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (250),
    cpf VARCHAR (15),
    email VARCHAR (100),
    telefone VARCHAR (100)
);

SELECT * FROM usuario;

ALTER TABLE usuario ADD COLUMN idade INT;
ALTER TABLE usuario ADD COLUMN sobrenome VARCHAR (100);
UPDATE usuario SET sobrenome = "Fiuza" WHERE user_id = 1;
UPDATE usuario SET idade = 21 WHERE user_id = 1;