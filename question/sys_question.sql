/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : sys_question

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2020-04-14 22:05:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for anser
-- ----------------------------
DROP TABLE IF EXISTS `anser`;
CREATE TABLE `anser` (
  `bsm` varchar(50) NOT NULL,
  `questionBsm` varchar(50) NOT NULL COMMENT '关联问题bsm',
  `selectItem` varchar(10) NOT NULL COMMENT '选项（ABCD,任意一个）',
  `score` varchar(20) NOT NULL DEFAULT '0' COMMENT '每个选项对应的分数',
  `content` varchar(255) NOT NULL COMMENT '选项内容',
  `itemPingGu` varchar(255) NOT NULL COMMENT '每个选项的评估内容',
  `itemBaoZhang` varchar(255) NOT NULL COMMENT '每个选项的保障内容',
  PRIMARY KEY (`bsm`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of anser
-- ----------------------------

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `bsm` varchar(50) NOT NULL,
  `typeBsm` varchar(50) NOT NULL COMMENT '关联问卷类型bsm',
  `questionTtile` varchar(255) NOT NULL COMMENT '问卷题目',
  `isSigle` varchar(10) NOT NULL COMMENT '是不是单选',
  PRIMARY KEY (`bsm`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------

-- ----------------------------
-- Table structure for sys_type
-- ----------------------------
DROP TABLE IF EXISTS `sys_type`;
CREATE TABLE `sys_type` (
  `bsm` varchar(50) NOT NULL COMMENT '主键bsm',
  `typeName` varchar(255) NOT NULL COMMENT '问卷类型',
  PRIMARY KEY (`bsm`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_type
-- ----------------------------
INSERT INTO `sys_type` VALUES ('8dfaa4d7bada40eeb653d3d4413795d6', '信息发布系统');
INSERT INTO `sys_type` VALUES ('93f507296d6349a897be786e28a0567b', 'OA系统');
INSERT INTO `sys_type` VALUES ('690a81aec94545f89aabce7879befdf1', '电子商务系统');
INSERT INTO `sys_type` VALUES ('c6e1bbd3531d496ea7e8f761d19fca9c', '工业控制系统');
INSERT INTO `sys_type` VALUES ('f5d5f31a89e0432dabf2ce8db9ec3a00', '信息管理系统');
INSERT INTO `sys_type` VALUES ('d69b372ceeda4d58946153b545b2bbc8', 'OA系统');
INSERT INTO `sys_type` VALUES ('c4f437057ade431594f954f35d687cac', '电子商务系统');
INSERT INTO `sys_type` VALUES ('f0b72de3da604115a6a302e68e2de4fc', '工业控制系统');
INSERT INTO `sys_type` VALUES ('f7db9513b67c4454af514d468d0e6596', '信息管理系统');
