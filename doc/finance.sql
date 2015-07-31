/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : finance

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2015-07-31 09:20:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `pk_role` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(255) NOT NULL COMMENT '角色',
  `access` int(1) NOT NULL COMMENT '访问权限',
  `enable` varchar(1) NOT NULL DEFAULT '0' COMMENT '0启用，1停用',
  `createtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `dr` varchar(1) NOT NULL DEFAULT '0' COMMENT '0为启用，1为停用',
  PRIMARY KEY (`pk_role`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'admin', '1', '0', '2015-07-31 09:19:00', '0');
INSERT INTO `role` VALUES ('2', 'user', '2', '0', '2015-07-31 09:19:19', '0');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `pk_user` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `loginid` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `access` int(1) NOT NULL,
  `enable` varchar(1) NOT NULL DEFAULT '0' COMMENT '0为启用，1为停用',
  `creatime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modifytime` datetime DEFAULT NULL,
  `dr` varchar(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`pk_user`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('37', 'user', 'user', 'ee11cbb19052e40b07aac0ca060c23ee', '2', '0', '2015-07-09 16:48:49', null, '0');
INSERT INTO `user` VALUES ('38', 'admin', 'admin', '21232f297a57a5a743894a0e4a801fc3', '1', '0', '2015-07-09 16:50:12', null, '0');
