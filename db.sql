/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  lemonk
 * Created: Jan 10, 2019
 */
-- MySQL dump 10.13  Distrib 8.0.13, for Linux (x86_64)
--
-- Host: 172.17.0.2    Database: indproject
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Messages`
--

DROP TABLE IF EXISTS `Messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Messages` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `sender` int(10) unsigned NOT NULL,
  `receiver` int(10) unsigned NOT NULL,
  `dos` datetime DEFAULT NULL,
  `data` varchar(250) DEFAULT NULL,
  `sd_status` int(11) DEFAULT NULL,
  `rc_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`,`sender`,`receiver`),
  KEY `fk_Users_has_Users_Users2_idx` (`receiver`),
  KEY `fk_Users_has_Users_Users1_idx` (`sender`),
  CONSTRAINT `fk_Users_has_Users_Users1` FOREIGN KEY (`sender`) REFERENCES `Users` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `fk_Users_has_Users_Users2` FOREIGN KEY (`receiver`) REFERENCES `Users` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Messages`
--

LOCK TABLES `Messages` WRITE;
/*!40000 ALTER TABLE `Messages` DISABLE KEYS */;
INSERT INTO `Messages` VALUES (27,13,39,'2018-12-26 00:00:00','day',1,1),(28,13,13,'2018-12-26 00:00:00','Good Day',1,1),(31,13,39,'2018-12-26 00:00:00','HI',1,0),(33,39,41,'2018-12-26 00:00:00','there',1,1),(34,13,39,'2018-12-26 00:00:00','hi',1,1),(36,13,41,'2018-12-26 00:00:00','hi',1,1),(37,39,13,'2018-12-26 00:00:00','hi',1,1),(38,39,41,'2018-12-26 00:00:00','hi',1,1),(39,13,39,'2018-12-28 00:00:00','a message',1,1),(40,13,41,'2018-12-28 00:00:00','My first messege to forum....',1,1),(41,1,41,'2018-12-28 00:00:00','bla bla bla bla bla bla bla bla bla',1,1),(43,1,41,'2018-12-28 00:00:00','test',1,1),(44,1,41,'2018-12-28 00:00:00','test2',1,1),(55,1,39,'2018-12-29 20:03:22','HI',1,1),(56,1,1,'2018-12-29 20:06:13','Admin test',1,1),(57,1,1,'2018-12-29 20:12:37','You\'re the best Admin ever!!!',1,1),(58,13,1,'2018-12-29 20:14:33','sdsdsd',1,1),(61,39,41,'2018-12-29 20:22:11','sdsdsds',1,1),(62,46,41,'2018-12-29 20:23:50','hiaa',1,1),(63,47,41,'2018-12-30 17:23:12','hiiiiiiiiiiiiiiiii',1,1),(66,50,1,'2018-12-30 21:35:40','can you view users? ',1,1),(67,50,39,'2018-12-30 21:41:21','lalalalalal',1,1),(72,1,41,'2019-01-01 18:29:21','another message to forum by admin',1,1),(76,39,1,'2019-01-01 19:59:47','Hello Admin',1,1),(89,1,41,'2019-01-01 22:02:33','hi all this is admin',1,1),(90,1,41,'2019-01-01 22:07:16','Hi all this is admin again',1,1),(91,1,39,'2019-01-01 22:08:38','HI lemon',1,1),(94,8,41,'2019-01-01 22:13:15','HI forum from second admin',1,1),(95,1,41,'2019-01-01 22:14:14','Hi forum',1,1),(98,13,39,'2019-01-02 18:40:39','Hi lemonk',1,1),(99,39,41,'2019-01-02 18:53:36','Happy New Year Everyone',1,1),(110,39,1,'2019-01-02 19:29:24','This is a very long message to check if the limit of 250 characters id working right,I hope it does because it\'s really borring to write studid long messages just to check something.............if it is working right this message should be cut off ',1,1),(112,55,55,'2019-01-03 20:06:56','hi me',1,1),(113,47,47,'2019-01-03 20:12:26','Hey it\'s me',1,1),(114,13,13,'2019-01-03 20:15:12','hi',1,1),(115,56,56,'2019-01-03 20:53:02','Hi me',1,1),(117,1,1,'2019-01-03 21:14:27','hjhjhj',1,1),(118,56,1,'2019-01-04 10:59:11','Hello',1,1),(119,57,41,'2019-01-04 11:45:21','hello all usres',1,1),(120,57,1,'2019-01-04 11:46:45','Hi Admin',1,0);
/*!40000 ALTER TABLE `Messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Roles`
--

DROP TABLE IF EXISTS `Roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Roles` (
  `id` int(10) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idRoles_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Roles`
--

LOCK TABLES `Roles` WRITE;
/*!40000 ALTER TABLE `Roles` DISABLE KEYS */;
INSERT INTO `Roles` VALUES (1,'admin'),(2,'user'),(3,'other');
/*!40000 ALTER TABLE `Roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Users`
--

DROP TABLE IF EXISTS `Users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Users` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Roles_id` int(10) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_Users_Roles1_idx` (`Roles_id`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Users`
--

LOCK TABLES `Users` WRITE;
/*!40000 ALTER TABLE `Users` DISABLE KEYS */;
INSERT INTO `Users` VALUES (1,1,'admin','admin',NULL,NULL,NULL,NULL,NULL),(5,2,'user10','user','user','user','M',18,'Athens'),(8,1,'superadmin','superadmin',NULL,NULL,NULL,NULL,''),(13,2,'Maria','maria','Maria','Alexadnri','F',37,'Athens'),(39,1,'lemonk','morrison','Leo','Kouros','M',40,'Marousi'),(41,3,'Forum','forum',NULL,NULL,NULL,NULL,NULL),(43,2,'me','me','me','me','M',45,'athens'),(44,2,'you','you','you','you','F',30,'athens'),(46,2,'admmin','admmin','fake','admmin','M',20,'Nowhere'),(47,2,'NewUser','newuser','new','user','M',25,'crete'),(50,2,'gkiom','1234','gkiom','kiom','M',99,'Thessaloniki'),(54,2,'newuser','new','newuser','created','F',25,'unknown'),(55,2,'auser','apassword','anotheruser','lastname','F',20,'Athens'),(56,1,'Leo','Kouros','Leo','Kouros','M',40,'Athens'),(57,2,'george','paspa','george','paspa','M',84,'athens');
/*!40000 ALTER TABLE `Users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-10 12:01:33

