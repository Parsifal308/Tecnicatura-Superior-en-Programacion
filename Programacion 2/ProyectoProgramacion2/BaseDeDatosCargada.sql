CREATE DATABASE  IF NOT EXISTS `bdprogramacion2` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bdprogramacion2`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bdprogramacion2
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno` (
  `alumno_dni` int NOT NULL,
  `alumno_nombre` varchar(45) DEFAULT NULL,
  `alumno_apellido` varchar(45) DEFAULT NULL,
  `alumno_domicilio` varchar(45) DEFAULT NULL,
  `alumno_telefono` int DEFAULT NULL,
  `alumno_codInscripcion` int DEFAULT NULL,
  PRIMARY KEY (`alumno_dni`),
  UNIQUE KEY `alumno_dni_UNIQUE` (`alumno_dni`),
  KEY `alumnoInscripcion_idx` (`alumno_codInscripcion`),
  CONSTRAINT `alumnoInscripcion` FOREIGN KEY (`alumno_codInscripcion`) REFERENCES `inscripcion` (`inscripcion_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
INSERT INTO `alumno` VALUES (37900425,'Guillermo','Marinero','Un Barco',37900425,NULL),(77111000,'Elena','Nito','Su Casa',77111000,NULL);
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carrera`
--

DROP TABLE IF EXISTS `carrera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carrera` (
  `carrera_cod` int NOT NULL,
  `carrera_nombre` varchar(45) DEFAULT NULL,
  `carrera_duracion` int DEFAULT NULL,
  PRIMARY KEY (`carrera_cod`),
  UNIQUE KEY `carrera_cod_UNIQUE` (`carrera_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carrera`
--

LOCK TABLES `carrera` WRITE;
/*!40000 ALTER TABLE `carrera` DISABLE KEYS */;
INSERT INTO `carrera` VALUES (1111,'Ingenieria en Sistemas',80),(2222,'Tecnicatura en Programacion',2),(3333,'Maestria en Memazos',5),(5555,'Paseador de Peces',1);
/*!40000 ALTER TABLE `carrera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cursado`
--

DROP TABLE IF EXISTS `cursado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursado` (
  `cursado_alumnoDNi` int NOT NULL,
  `cursado_codMat` int NOT NULL,
  `cursado_nota` int DEFAULT NULL,
  PRIMARY KEY (`cursado_alumnoDNi`,`cursado_codMat`),
  UNIQUE KEY `cursado_alumnoDNi_UNIQUE` (`cursado_alumnoDNi`),
  KEY `cursadoMateria_idx` (`cursado_codMat`),
  CONSTRAINT `cursadoAlumno` FOREIGN KEY (`cursado_alumnoDNi`) REFERENCES `alumno` (`alumno_dni`),
  CONSTRAINT `cursadoMateria` FOREIGN KEY (`cursado_codMat`) REFERENCES `materia` (`materia_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursado`
--

LOCK TABLES `cursado` WRITE;
/*!40000 ALTER TABLE `cursado` DISABLE KEYS */;
INSERT INTO `cursado` VALUES (37900425,101,7);
/*!40000 ALTER TABLE `cursado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inscripcion`
--

DROP TABLE IF EXISTS `inscripcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inscripcion` (
  `inscripcion_cod` int NOT NULL,
  `inscripcion_nombre` varchar(45) DEFAULT NULL,
  `inscripcion_codCar` int DEFAULT NULL,
  PRIMARY KEY (`inscripcion_cod`),
  UNIQUE KEY `inscripcion_cod_UNIQUE` (`inscripcion_cod`),
  KEY `inscripcionCarrera_idx` (`inscripcion_codCar`),
  CONSTRAINT `inscripcionCarrera` FOREIGN KEY (`inscripcion_codCar`) REFERENCES `carrera` (`carrera_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inscripcion`
--

LOCK TABLES `inscripcion` WRITE;
/*!40000 ALTER TABLE `inscripcion` DISABLE KEYS */;
INSERT INTO `inscripcion` VALUES (1,'Inscripcion Marinero',5555),(2,'Inscrip2',2222);
/*!40000 ALTER TABLE `inscripcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materia`
--

DROP TABLE IF EXISTS `materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materia` (
  `materia_cod` int NOT NULL,
  `materia_nombre` varchar(45) DEFAULT NULL,
  `materia_profDNI` int DEFAULT NULL,
  PRIMARY KEY (`materia_cod`),
  UNIQUE KEY `materia_cod_UNIQUE` (`materia_cod`),
  KEY `materiaProfesor_idx` (`materia_profDNI`),
  CONSTRAINT `materiaProfesor` FOREIGN KEY (`materia_profDNI`) REFERENCES `profesor` (`profesor_dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materia`
--

LOCK TABLES `materia` WRITE;
/*!40000 ALTER TABLE `materia` DISABLE KEYS */;
INSERT INTO `materia` VALUES (101,'Programacion 1',11000000),(102,'Laboratorio de Programacion 1',22000000),(204,'Estadistica',33000000),(302,'Programacion 513',44000000);
/*!40000 ALTER TABLE `materia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesor`
--

DROP TABLE IF EXISTS `profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesor` (
  `profesor_dni` int NOT NULL,
  `profesor_nombre` varchar(45) DEFAULT NULL,
  `profesor_apellido` varchar(45) DEFAULT NULL,
  `profesor_domicilio` varchar(45) DEFAULT NULL,
  `profesor_telefono` int DEFAULT NULL,
  PRIMARY KEY (`profesor_dni`),
  UNIQUE KEY `profesor_dni_UNIQUE` (`profesor_dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesor`
--

LOCK TABLES `profesor` WRITE;
/*!40000 ALTER TABLE `profesor` DISABLE KEYS */;
INSERT INTO `profesor` VALUES (11000000,'Armando','Bronca Segura','Catamarca 1378',261129837),(22000000,'Ana','Tomia','Sta Cruz 1895',26117823),(33000000,'Helen','Chufe','Tierra del Fuego 134',26113897),(44000000,'Susana','Torio','Mendoza 1283',29713142),(55000000,'Dolores','Delano','Salta 231',1234742);
/*!40000 ALTER TABLE `profesor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-19 11:12:12
