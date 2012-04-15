USE `dreamgo`;
DROP TABLE IF EXISTS `User`;
CREATE  TABLE `User` (
  `user_id` INT NOT NULL AUTO_INCREMENT ,
  `user_name` VARCHAR(45) NOT NULL ,
  `user_password` VARCHAR(100) NULL ,
  PRIMARY KEY (`user_id`) ,
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC) ,
  UNIQUE INDEX `user_name_UNIQUE` (`user_name` ASC)
 )ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;
INSERT INTO `user` (`user_id`,`user_name`,`user_password`) VALUES(1,'nanfeng','123');
