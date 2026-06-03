CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);

INSERT INTO students VALUES(1,'Abhinav',21);
INSERT INTO students VALUES(2,'Rahul',22);