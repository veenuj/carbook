
CREATE DATABASE `carBookingApp`; 
USE `carBookingApp`;

SET NAMES utf8 ;
SET character_set_client = utf8mb4 ;


DROP TABLE IF EXISTS `passengerName`;
CREATE TABLE `passengerName` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `pessanger_name` varchar(45) DEFAULT NULL,
  `source` varchar(45) DEFAULT NULL,
  `destination` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
select * from  passengerName;



CREATE TABLE `cabDetails` (
  `cab_id` int(4) NOT NULL AUTO_INCREMENT,
  `cab_name` varchar(50) NOT NULL,
  PRIMARY KEY (`cab_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `cabDetails` VALUES (1,'I20');
INSERT INTO `cabDetails` VALUES (2,'Alto');
INSERT INTO `cabDetails` VALUES (3,'Baleno');
INSERT INTO `cabDetails` VALUES (4,'Thar');
select* from  cabdetails;



