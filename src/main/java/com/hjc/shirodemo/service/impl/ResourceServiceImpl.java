package com.hjc.shirodemo.service.impl;

import com.hjc.shirodemo.persistence.dao.ResourceDao;
import com.hjc.shirodemo.persistence.dao.entity.Resource;
import com.hjc.shirodemo.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

/**
 * Created by Bravowhale on 2016/12/27.
 */
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

    public List<Resource> findAll() {
        return resourceDao.findAll();
    }

    public Set<String> findPermissions(Set<Long> resouceIds) {
        return resourceDao.findPermissions(resouceIds);
    }

    public List<Resource> findMenus(Set<String> permissions) {
        return resourceDao.findMenus(permissions);
    }
}
