/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80100 (8.1.0)
 Source Host           : localhost:3306
 Source Schema         : ruoyi-vue-blog

 Target Server Type    : MySQL
 Target Server Version : 80100 (8.1.0)
 File Encoding         : 65001

 Date: 24/06/2024 21:43:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for works_detail
-- ----------------------------
DROP TABLE IF EXISTS `works_detail`;
CREATE TABLE `works_detail`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `work_id` int NOT NULL COMMENT '外键，作品id',
  `file_type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '文件类型（教案，视频，报告，培养方案，课程标准，附件等）',
  `file_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '文件存储路径',
  `upload_time` datetime NOT NULL COMMENT '上传时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `work_id`(`work_id` ASC) USING BTREE,
  CONSTRAINT `works_detail_ibfk_1` FOREIGN KEY (`work_id`) REFERENCES `tb_works` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '作品详情表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of works_detail
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
