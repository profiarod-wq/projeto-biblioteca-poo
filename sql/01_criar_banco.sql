CREATE DATABASE IF NOT EXISTS biblioteca_poo;

USE biblioteca_poo;

CREATE TABLE IF NOT EXISTS livros (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(150) NOT NULL,
    isbn VARCHAR(30) NOT NULL UNIQUE,
    ano INT NOT NULL,
    autor VARCHAR(120) NOT NULL,
    categoria VARCHAR(100) NOT NULL
);

INSERT IGNORE INTO livros (titulo, isbn, ano, autor, categoria)
VALUES
('Java para Iniciantes', '9780000000001', 2026, 'Ana Souza', 'Tecnologia'),
('Programação Orientada a Objetos', '9780000000002', 2025, 'Carlos Lima', 'Tecnologia');

SELECT * FROM livros;
