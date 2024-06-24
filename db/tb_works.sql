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

 Date: 24/06/2024 21:43:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_works
-- ----------------------------
DROP TABLE IF EXISTS `tb_works`;
CREATE TABLE `tb_works`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '作品名称',
  `school` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '学校名称',
  `contestant` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '参赛人',
  `contact_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '联系方式',
  `group_id` int NOT NULL COMMENT '外键，报名组别id',
  `average_score` decimal(5, 2) NULL DEFAULT NULL COMMENT '实时平均分',
  `submit_time` datetime NOT NULL COMMENT '提交时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '作品表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_works
-- ----------------------------
INSERT INTO `tb_works` VALUES (1, '测试', '学校', '罗', '1333', 23, 55.00, '2024-06-12 19:33:46');

SET FOREIGN_KEY_CHECKS = 1;
