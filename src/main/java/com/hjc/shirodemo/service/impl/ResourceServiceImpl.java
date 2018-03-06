package com.hjc.shirodemo.service.impl;

import com.hjc.shirodemo.persistence.dao.ResourceDao;
import com.hjc.shirodemo.persistence.dao.entity.Resource;
import com.hjc.shirodemo.service.ResourceService;
import org.apache.shiro.authz.permission.WildcardPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Bravowhale on 2016/12/27.
 */
@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceDao resourceDao;

    public int createResource(Resource resource) {
        return resourceDao.insert(resource);
    }

    public int updateResource(Resource resource) {
        return resourceDao.updateByPrimaryKeySelective(resource);
    }

    public void deleteResource(Long resourceId) {
        resourceDao.deleteByPrimaryKey(resourceId);
    }

    public Resource findOne(String id) {
        return resourceDao.selectByPrimaryKey(id);
    }

    public List<Resource> findAll() {
        return resourceDao.findAll();
    }

    public Set<String> findPermissions(Set<String> resourceIds) {
        Set<String> permissions = new HashSet<String>();
        for (String resourceId:resourceIds){
            Resource resource = findOne(resourceId);
            if(resource != null && !StringUtils.isEmpty(resource.getPermission())){
                permissions.add(resource.getPermission());
            }
        }
        return permissions;
    }

    public List<Resource> findMenus(Set<String> permissions) {
        List<Resource> allResources = findAll();
        List<Resource> menus = new ArrayList<Resource>();
        for (Resource resource : allResources) {
            if(resource.isRootNode()){
                continue;
            }
            if(resource.getType() != Resource.ResourceType.menu){
                continue;
            }
            if(!hasPermission(permissions,resource)){
                continue;
            }
            menus.add(resource);
        }
        return menus;
    }

    private boolean hasPermission(Set<String> permissions,Resource resource){
        if(StringUtils.isEmpty(resource.getPermission())){
            return true;
        }
        for(String permission : permissions){
            WildcardPermission p1 = new WildcardPermission(permission);
            WildcardPermission p2 = new WildcardPermission(resource.getPermission());
            if(p1.implies(p2) || p2.implies(p1)){
                return true;
            }
        }
        return false;
    }
}
