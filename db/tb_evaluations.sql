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

 Date: 24/06/2024 21:43:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_evaluations
-- ----------------------------
DROP TABLE IF EXISTS `tb_evaluations`;
CREATE TABLE `tb_evaluations`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `work_id` int NOT NULL COMMENT '外键，作品id',
  `evaluator_id` int NOT NULL COMMENT '外键，评委id',
  `teaching_implementation` decimal(10, 0) NULL DEFAULT NULL COMMENT '教学实施评分',
  `lesson_plan` decimal(10, 0) NULL DEFAULT NULL COMMENT '教案评分',
  `video_material` decimal(10, 0) NULL DEFAULT NULL COMMENT '视频评分',
  `talent_training_plan` decimal(10, 0) NULL DEFAULT NULL COMMENT '专业人才培养方案评分',
  `course_standard` decimal(10, 0) NULL DEFAULT NULL COMMENT '课程标准评分',
  `teaching_material` decimal(10, 0) NULL DEFAULT NULL COMMENT '教材选用评分',
  `score` decimal(5, 2) NOT NULL COMMENT '总得分',
  `evaluation_time` datetime NOT NULL COMMENT '评分时间',
  `school` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '学校名称',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `work_id`(`work_id` ASC) USING BTREE,
  INDEX `evaluator_id`(`evaluator_id` ASC) USING BTREE,
  CONSTRAINT `tb_evaluations_ibfk_1` FOREIGN KEY (`work_id`) REFERENCES `tb_works` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_evaluations_ibfk_2` FOREIGN KEY (`evaluator_id`) REFERENCES `tb_users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '评价表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_evaluations
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
