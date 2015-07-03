--创建库
create database test;
use test;
--创建表
CREATE TABLE user(id INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(20), age INT)ENGINE=InnoDB  DEFAULT CHARSET=utf8;
INSERT INTO user(NAME, age) VALUES('Tom', 12);
INSERT INTO user(NAME, age) VALUES('Jack', 11);
INSERT INTO user(NAME, age) VALUES('Jli', 10);

--文章表
Drop TABLE IF EXISTS article;
Create TABLE article (
  id int(11) NOT NULL auto_increment,
  userid int(11) NOT NULL,
  title varchar(100) NOT NULL,
  content text NOT NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;
Insert INTO article VALUES ('1', '1', 'test_title', 'test_content');
Insert INTO article VALUES ('2', '1', 'test_title_2', 'test_content_2');
Insert INTO article VALUES ('3', '1', 'test_title_3', 'test_content_3');
Insert INTO article VALUES ('4', '1', 'test_title_4', 'test_content_4');




