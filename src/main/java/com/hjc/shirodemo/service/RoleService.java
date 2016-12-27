package com.hjc.shirodemo.service;

import java.util.Set;

/**
 * Created by Bravowhale on 2016/12/27.
 */
public interface RoleService {
    /*
    * 根据角色编号获得角色标示符列表
    * */
    Set<String> findRoles(Long... roleIds);
    /*
    * 根据角色编号获得权限字符串列表
    * */
    Set<String> findPermission(Long[] roleIds);
}
