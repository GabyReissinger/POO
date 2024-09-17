CREATE TABLE cliente (codigo SERIAL PRIMARY KEY,
	nome VARCHAR (60), telefone VARCHAR(11), 
	email VARCHAR(30) NOT NULL UNIQUE);
	
INSERT INTO cliente (nome, telefone, email) VALUES ('Ana', '2422373886', 'ana@gmail.com');