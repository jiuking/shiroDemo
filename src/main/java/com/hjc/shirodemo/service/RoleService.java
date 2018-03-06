package com.hjc.shirodemo.service;

import com.hjc.shirodemo.persistence.dao.entity.Role;

import java.util.Set;

/**
 * Created by Bravowhale on 2016/12/27.
 */
public interface RoleService {

    public int createRole(Role role);

    public int updateRole(Role role);

    public void deleteRole(String roleId);

    /**
     * @Author: Administrator
     * @Description: 根据角色编号获得角色标示符列表
     * @param: roleIds 角色id
     * @Date: 14:01 2018/3/5 0005
     * @return: java.util.Set<java.lang.String>
     * @throws:
     */
    Set<String> findRoles(String roleIds);
    /**
     * @Author: Administrator
     * @Description: 根据角色编号获得权限字符串列表
     * @param: roleIds 角色id
     * @Date: 14:02 2018/3/5 0005
     * @return: java.util.Set<java.lang.String>
     * @throws:
     */
    Set<String> findPermissions(String roleIds);
}
