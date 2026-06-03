CREATE DATABASE bankdb;

USE bankdb;

CREATE TABLE accounts(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    balance DOUBLE
);

INSERT INTO accounts VALUES(1,'A',5000);
INSERT INTO accounts VALUES(2,'B',3000);