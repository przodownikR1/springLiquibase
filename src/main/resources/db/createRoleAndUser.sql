create schema sampleDB;
CREATE USER 'sample'@'localhost' IDENTIFIED BY 'sample';
GRANT ALL PRIVILEGES ON * . * TO 'sample'@'localhost';
FLUSH PRIVILEGES;


create schema test1;
CREATE USER 'test1'@'localhost' IDENTIFIED BY 'test1';
GRANT ALL PRIVILEGES ON * . * TO 'test1'@'localhost';
FLUSH PRIVILEGES;

create schema sonar3;
CREATE USER 'sonar3'@'localhost' IDENTIFIED BY 'sonar3';
GRANT ALL PRIVILEGES ON * . * TO 'sonar3'@'localhost';
FLUSH PRIVILEGES;

