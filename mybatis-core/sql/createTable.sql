--创建库
create database test;
use test;
--创建表
CREATE TABLE user(id INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(20), age INT);
INSERT INTO user(NAME, age) VALUES('Tom', 12);
INSERT INTO user(NAME, age) VALUES('Jack', 11);
INSERT INTO user(NAME, age) VALUES('Jli', 10);



