/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50152
Source Host           : localhost:3306
Source Database       : chat

Target Server Type    : MYSQL
Target Server Version : 50152
File Encoding         : 65001

Date: 2014-03-31 13:08:48
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `chat_notes`
-- ----------------------------
DROP TABLE IF EXISTS `chat_notes`;
CREATE TABLE `chat_notes` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id_from` bigint(20) NOT NULL COMMENT '发送消息用户',
  `user_id_to` bigint(20) NOT NULL COMMENT '接收消息的用户',
  `chat_detail` varchar(255) NOT NULL COMMENT '聊天记录',
  `send_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chat_notes
-- ----------------------------
INSERT INTO chat_notes VALUES ('1', '1', '2', '2222', '2014-03-31 12:47:47');
INSERT INTO chat_notes VALUES ('2', '1', '2', 'ok', '2014-03-31 13:07:41');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `number` bigint(20) NOT NULL COMMENT '系统随即生成的号码',
  `nick_name` varchar(255) NOT NULL COMMENT '昵称',
  `email` varchar(255) NOT NULL COMMENT '邮件',
  `create_time` datetime NOT NULL COMMENT '用户创建时间',
  `password` varchar(255) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES ('11', '123123', '1111', '111', '2014-03-28 16:21:34', '123123');
INSERT INTO user VALUES ('12', '123123', '1111', '111', '2014-03-28 17:09:03', '123123');
INSERT INTO user VALUES ('13', '123123', '1111', '111', '2014-03-31 11:01:36', '123123');

-- ----------------------------
-- Table structure for `user_relation`
-- ----------------------------
DROP TABLE IF EXISTS `user_relation`;
CREATE TABLE `user_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL COMMENT '用户Id',
  `relation_user_id` bigint(20) NOT NULL COMMENT '好友 陌生人 黑名单 用户ID',
  `relation` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 好友 1 陌生人 2 黑名单 ',
  `create_time` datetime NOT NULL COMMENT '加好友的时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_relation
-- ----------------------------
INSERT INTO user_relation VALUES ('2', '1', '2', '1', '2014-03-31 11:27:37');
INSERT INTO user_relation VALUES ('3', '3', '2', '6', '2014-03-31 11:28:04');
