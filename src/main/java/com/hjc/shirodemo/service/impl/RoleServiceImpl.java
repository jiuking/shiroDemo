package com.hjc.shirodemo.service.impl;

import com.hjc.shirodemo.persistence.dao.RoleDao;
import com.hjc.shirodemo.persistence.dao.entity.Role;
import com.hjc.shirodemo.service.ResourceService;
import com.hjc.shirodemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Bravowhale on 2016/12/27.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private ResourceService resourceService;

    public int createRole(Role role){
       return roleDao.insert(role);
    }

    public int updateRole(Role role){
        return roleDao.updateByPrimaryKeySelective(role);
    }

    public void deleteRole(String roleId){
        roleDao.deleteByPrimaryKey(roleId);
    }

    public Role findOne(String roleId){
        return roleDao.selectByPrimaryKey(roleId);
    }

    public List<Role> findAll(){
        return roleDao.findAll();
    }

    public Set<String> findRoles(String roleIds) {
        Set<String> roles = new HashSet<String>();
//        for (String id: roleIds) {
            Role role = findOne(roleIds);
            if(role != null){
                roles.add(role.getRole());
//            }
        }
        return roles;
    }

    public Set<String> findPermissions(String roleIds) {
        Set<String> resourceIds = new HashSet<String>();
//        for(Long roleId:roleIds){
            Role role = findOne(roleIds);
            if(role != null){
                resourceIds.add(role.getResourceIds());
            }
//        }
        return resourceService.findPermissions(resourceIds);
    }
}
