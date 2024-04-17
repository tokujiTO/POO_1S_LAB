-- Active: 1713360142832@@mysql-387e0124-tiagomassuda123-850a.b.aivencloud.com@23042@defaultdb

-- cod_usuario, login, senha, tipo
CREATE TABLE tb_usuario (
    cod_usuario INT PRIMARY KEY AUTO_INCREMENT, login VARCHAR(200) NOT NULL, senha VARCHAR(200) NOT NULL, tipo INT NOT NULL
);

INSERT INTO
    tb_usuario (login, senha, tipo)
VALUES ('admin', 'admin', 1);

INSERT INTO
    tb_usuario (login, senha, tipo)
VALUES ('comum', 'comum', 2);

SELECT * FROM tb_usuario;

UPDATE tb_usuario SET login = 'Comum' WHERE cod_usuario = 2;

SELECT * FROM tb_usuario;

--Usuário de id igual a 1 passa a ter login igual a Admin e senha igual a 123456, num update só

UPDATE tb_usuario
SET
    login = 'Admin',
    senha = '123456'
WHERE
    cod_usuario = 1

DELETE FROM tb_usuario WHERE cod_usuario = 1;