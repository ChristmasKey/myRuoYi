/*
 Navicat Premium Data Transfer

 Source Server         : local-db
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : my-ruoyi

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 21/10/2022 18:32:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for center_model
-- ----------------------------
DROP TABLE IF EXISTS `center_model`;
CREATE TABLE `center_model`  (
  `resource_id` bigint(20) NOT NULL COMMENT '资源ID',
  `number` char(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '编号',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态（0：禁用；1：正常/空闲；2：占用；3：维保中；4：其他）',
  PRIMARY KEY (`resource_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for center_resource
-- ----------------------------
DROP TABLE IF EXISTS `center_resource`;
CREATE TABLE `center_resource`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '资源ID',
  `tenant_id` bigint(20) NULL DEFAULT 0 COMMENT '租户号',
  `revision` int(10) NULL DEFAULT NULL COMMENT '乐观锁',
  `created_by` bigint(20) NULL DEFAULT NULL COMMENT '创建人',
  `created_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updated_by` bigint(20) NULL DEFAULT NULL COMMENT '更新人',
  `updated_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `resource_type` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源类型',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源名称',
  `model` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源型号',
  `buy_time` datetime(0) NULL DEFAULT NULL COMMENT '购买时间',
  `base_function` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '基本功能',
  `category` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类标签',
  `location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '存放地点',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for center_room
-- ----------------------------
DROP TABLE IF EXISTS `center_room`;
CREATE TABLE `center_room`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '房间ID',
  `num` char(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间号',
  `floor_num` int(10) NULL DEFAULT NULL COMMENT '所在楼层号',
  `area` int(10) NULL DEFAULT NULL COMMENT '房间面积',
  `type` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间类型',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间状态（0：禁用，1：空闲，2：占用，3：其他）',
  `capacity` int(10) NULL DEFAULT NULL COMMENT '人数容量',
  `introduction` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房间介绍',
  `resource_id` bigint(20) NULL DEFAULT NULL COMMENT '资源ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
