/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.3.66
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : 192.168.3.66:3306
 Source Schema         : customer_db

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 28/05/2020 01:56:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customer_table
-- ----------------------------
DROP TABLE IF EXISTS `customer_table`;
CREATE TABLE `customer_table`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `sex` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tell` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `addr` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer_table
-- ----------------------------
INSERT INTO `customer_table` VALUES (1, '张学友', '1', '13765090931', '香港九龙');
INSERT INTO `customer_table` VALUES (2, '谢娜', '2', '13810210232', '四川成都');
INSERT INTO `customer_table` VALUES (3, '黎明', '1', '13765121695', '北京市');
INSERT INTO `customer_table` VALUES (4, '王宝强', '1', '13018089565', '河南新乡市');

SET FOREIGN_KEY_CHECKS = 1;
