CREATE DATABASE if not exists `db_users`;

DROP TABLE if exists `db_users`.`user`;

CREATE TABLE `db_users`.`user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(45) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `nick_name_UNIQUE` (`nick_name`),
  UNIQUE KEY `phone_number_UNIQUE` (`phone_number`)
);

INSERT INTO `db_users`.`user`
(`user_id`,
`nick_name`,
`first_name`,
`last_name`,
`email`,
`phone_number`)
VALUES
('1', 'davijob', 'David', 'Jiménez', 'davidjobjimenezsuarez@alumno.ieselrincon.es', '672146643');

INSERT INTO `db_users`.`user`
(`user_id`,
`nick_name`,
`first_name`,
`last_name`,
`email`,
`phone_number`)
VALUES
('2', 'johndoe', 'John', 'Doe', 'john@doe.com', '555555555');

INSERT INTO `db_users`.`user`
(`user_id`,
`nick_name`,
`first_name`,
`last_name`,
`email`,
`phone_number`)
VALUES
('3', 'alias', 'Pedro', 'Pérez', 'pedroperez@wahwee.es', '666123456');
