/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50615
Source Host           : localhost:3306
Source Database       : test1

Target Server Type    : MYSQL
Target Server Version : 50615
File Encoding         : 65001

Date: 2020-09-19 20:26:02
*/

SET FOREIGN_KEY_CHECKS=0;

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
