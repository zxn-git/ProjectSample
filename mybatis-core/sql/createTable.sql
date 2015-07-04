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


--创建存储过程(查询得到user数量, 如果传入的是0查所有 ，else 大于传入参数)
--DELIMITER $  用$作为语句分割符 
DELIMITER $
CREATE PROCEDURE test.get_user_count(IN para INT, OUT user_count INT)
BEGIN
IF para=0 THEN
SELECT COUNT(*) FROM test.user  INTO user_count;
ELSE
SELECT COUNT(*) FROM test.user WHERE age>para INTO user_count;
END IF;
END
$
--调用存储过程
--DELIMITER ; 回复原来的分隔符;
DELIMITER ;
SET @user_count = 0;
CALL test.get_user_count(11, @user_count);
SELECT @user_count;




