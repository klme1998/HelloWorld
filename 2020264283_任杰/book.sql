/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50615
Source Host           : localhost:3306
Source Database       : test1

Target Server Type    : MYSQL
Target Server Version : 50615
File Encoding         : 65001

Date: 2020-09-19 20:25:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `code` varchar(255) NOT NULL DEFAULT '',
  `title` varchar(255) DEFAULT NULL,
  `publishDate` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `numberOfPages` int(11) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('B001', 'Effective Java Programming', '2001-01-05', 'Joshua Bloch', '252');
INSERT INTO `book` VALUES ('B002', 'Design Patterns', '1995-02-28', 'Erich Gamma et al', '395');
INSERT INTO `book` VALUES ('B003', 'Refactoring', '1999-10-01', 'Martin Fowler', '431');
INSERT INTO `book` VALUES ('B004', 'The Mythical Man-Month', '1995-12-09', 'Frederick P. Brooks', '322');
INSERT INTO `book` VALUES ('B005', 'Code Complete', '1993-01-09', 'Steve C McConnell', '857');
INSERT INTO `book` VALUES ('B006', 'The Psychology of Comp. Progr.', '1998-08-08', 'Gerald M. Weinberg', '360');
INSERT INTO `book` VALUES ('B007', 'Programming Pearls', '1999-09-21', 'Jon Bentley', '239');
INSERT INTO `book` VALUES ('B008', 'The Practice of Programming', '1999-07-19', 'Brian W. Kernighan', '257');
INSERT INTO `book` VALUES ('B009', 'Peopleware', '1999-06-07', 'Tom Demarco', '245');
INSERT INTO `book` VALUES ('B010', 'The Java Programming Language', '2000-11-12', 'Ken Arnold', '595');
INSERT INTO `book` VALUES ('B011', 'Core J2EE Patterns', '2001-10-10', 'Deepak Alur', '496');
INSERT INTO `book` VALUES ('B012', 'Rapid Development', '1996-11-19', 'Steve C McConnell', '680');
INSERT INTO `book` VALUES ('B013', 'Applying UML and Patterns', '2001-12-12', 'Craig Larman', '656');
INSERT INTO `book` VALUES ('B014', 'The Little Schemer', '1995-05-05', 'Daniel P. Friedman', '216');
INSERT INTO `book` VALUES ('B015', 'Agile Software Development', '2001-04-26', 'Alistair Cockburn', '256');
INSERT INTO `book` VALUES ('B016', 'Suprise', '2020-5-20', 'FY', '777');

-- ----------------------------
-- Table structure for `record`
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `code` varchar(255) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `publishDate` varchar(255) DEFAULT NULL,
  `performer` varchar(255) DEFAULT NULL,
  `format` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('R001', 'Getz/Gilberto', '1963-03-15', 'Stan Getz and Joao Gilberto', 'CD');
INSERT INTO `record` VALUES ('R002', 'Kind of Blue', '1997-04-09', 'Miles Davis', 'CD');
INSERT INTO `record` VALUES ('R003', 'Supernatural', '1999-09-09', 'Santana', 'Tape');
INSERT INTO `record` VALUES ('R004', 'Private Collection', '1983-08-07', 'Jon & Vangelis', 'Tape');
INSERT INTO `record` VALUES ('R005', 'Abbey Road', '1969-12-23', 'Beatles', 'CD');
INSERT INTO `record` VALUES ('R006', 'Joshua Tree', '1990-11-17', 'U2', 'CD');
