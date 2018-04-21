CREATE DATABASE takeout DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci
/*
Navicat MySQL Data Transfer

Source Server         : 
Source Server Version : 50720
Source Host           : 
Source Database       : takeout

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-04-22 01:32:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` varchar(255) NOT NULL,
  `userid` varchar(255) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_sex` varchar(255) DEFAULT NULL,
  `add_Is_Default` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order_dtl
-- ----------------------------
DROP TABLE IF EXISTS `order_dtl`;
CREATE TABLE `order_dtl` (
  `id` varchar(36) NOT NULL,
  `item_name` varchar(255) DEFAULT NULL,
  `item_num` smallint(6) DEFAULT NULL,
  `item_money` varchar(255) DEFAULT NULL,
  `order_id` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` varchar(255) NOT NULL,
  `userid` varchar(255) NOT NULL,
  `appointment_time` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `money` smallint(10) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `user_sex` varchar(255) DEFAULT NULL,
  `doc_status` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `id` varchar(36) NOT NULL,
  `room_name` varchar(255) DEFAULT NULL,
  `room_date` varchar(16) DEFAULT NULL,
  `room_num` int(11) DEFAULT NULL,
  `room_time` varchar(128) DEFAULT NULL,
  `userId` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  `room_remark` varchar(255) DEFAULT NULL,
  `room_is_now` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
