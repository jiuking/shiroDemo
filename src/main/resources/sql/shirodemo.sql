/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : shirodemo

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-12-26 21:57:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_organization
-- ----------------------------
DROP TABLE IF EXISTS `sys_organization`;
CREATE TABLE `sys_organization` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `parent_ids` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idx_sys_organization_parent_id` (`parent_id`),
  KEY `idx_sys_organization_parent_ids` (`parent_ids`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_organization
-- ----------------------------
INSERT INTO `sys_organization` VALUES ('1', '总公司', '0', '0/', '1');
INSERT INTO `sys_organization` VALUES ('2', '分公司1', '1', '0/1/', '1');
INSERT INTO `sys_organization` VALUES ('3', '分公司2', '1', '0/1/', '1');
INSERT INTO `sys_organization` VALUES ('4', '分公司11', '2', '0/1/2/', '1');

-- ----------------------------
-- Table structure for sys_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `parent_ids` varchar(100) DEFAULT NULL,
  `permission` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idx_sys_resource_parent_id` (`parent_id`),
  KEY `idx_sys_resource_parent_ids` (`parent_ids`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_resource
-- ----------------------------
INSERT INTO `sys_resource` VALUES ('1', '资源', 'menu', '', '0', '0/', '', '1');
INSERT INTO `sys_resource` VALUES ('11', '组织机构管理', 'menu', '/organization', '1', '0/1/', 'organization:*', '1');
INSERT INTO `sys_resource` VALUES ('12', '组织机构新增', 'button', '', '11', '0/1/11/', 'organization:create', '1');
INSERT INTO `sys_resource` VALUES ('13', '组织机构修改', 'button', '', '11', '0/1/11/', 'organization:update', '1');
INSERT INTO `sys_resource` VALUES ('14', '组织机构删除', 'button', '', '11', '0/1/11/', 'organization:delete', '1');
INSERT INTO `sys_resource` VALUES ('15', '组织机构查看', 'button', '', '11', '0/1/11/', 'organization:view', '1');
INSERT INTO `sys_resource` VALUES ('21', '用户管理', 'menu', '/user', '1', '0/1/', 'user:*', '1');
INSERT INTO `sys_resource` VALUES ('22', '用户新增', 'button', '', '21', '0/1/21/', 'user:create', '1');
INSERT INTO `sys_resource` VALUES ('23', '用户修改', 'button', '', '21', '0/1/21/', 'user:update', '1');
INSERT INTO `sys_resource` VALUES ('24', '用户删除', 'button', '', '21', '0/1/21/', 'user:delete', '1');
INSERT INTO `sys_resource` VALUES ('25', '用户查看', 'button', '', '21', '0/1/21/', 'user:view', '1');
INSERT INTO `sys_resource` VALUES ('31', '资源管理', 'menu', '/resource', '1', '0/1/', 'resource:*', '1');
INSERT INTO `sys_resource` VALUES ('32', '资源新增', 'button', '', '31', '0/1/31/', 'resource:create', '1');
INSERT INTO `sys_resource` VALUES ('33', '资源修改', 'button', '', '31', '0/1/31/', 'resource:update', '1');
INSERT INTO `sys_resource` VALUES ('34', '资源删除', 'button', '', '31', '0/1/31/', 'resource:delete', '1');
INSERT INTO `sys_resource` VALUES ('35', '资源查看', 'button', '', '31', '0/1/31/', 'resource:view', '1');
INSERT INTO `sys_resource` VALUES ('41', '角色管理', 'menu', '/role', '1', '0/1/', 'role:*', '1');
INSERT INTO `sys_resource` VALUES ('42', '角色新增', 'button', '', '41', '0/1/41/', 'role:create', '1');
INSERT INTO `sys_resource` VALUES ('43', '角色修改', 'button', '', '41', '0/1/41/', 'role:update', '1');
INSERT INTO `sys_resource` VALUES ('44', '角色删除', 'button', '', '41', '0/1/41/', 'role:delete', '1');
INSERT INTO `sys_resource` VALUES ('45', '角色查看', 'button', '', '41', '0/1/41/', 'role:view', '1');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `resource_ids` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idx_sys_role_resource_ids` (`resource_ids`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'admin', '超级管理员', '11,21,31,41', '1');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `organization_id` bigint(20) DEFAULT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `salt` varchar(100) DEFAULT NULL,
  `role_ids` varchar(100) DEFAULT NULL,
  `locked` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_sys_user_username` (`username`),
  KEY `idx_sys_user_organization_id` (`organization_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '1', 'admin', 'd3c59d25033dbf980d29554025c23a75', '8d78869f470951332959580424d4bf4f', '1', '0');
