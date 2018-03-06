package com.hjc.shirodemo.service;

import com.hjc.shirodemo.persistence.dao.entity.Resource;

import java.util.List;
import java.util.Set;

/**
 * Created by Bravowhale on 2016/12/27.
 */
public interface ResourceService {

    int createResource(Resource resource);

    int updateResource(Resource resource);

    void deleteResource(Long resourceId);

    Resource findOne(String id);

    List<Resource> findAll();

    /**
     * @Author: hjc
     * @Description: 得到资源所对应的权限字符串
     * @param: resouceIds 资源ids
     * @Date: 13:53 2018/3/5 0005
     * @return: java.util.Set<java.lang.String>
     * @throws:
     */;
    Set<String> findPermissions(Set<String> resouceIds);

    /**
     * @Author: hjc
     * @Description: 根据用户权限得到菜单
     * @param: 权限ids
     * @Date: 13:54 2018/3/5 0005
     * @return: java.util.List<com.hjc.shirodemo.persistence.dao.entity.Resource>
     * @throws:
     */
    List<Resource> findMenus(Set<String> permissions);
}
