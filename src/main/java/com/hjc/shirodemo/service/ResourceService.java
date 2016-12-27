package com.hjc.shirodemo.service;

import com.hjc.shirodemo.persistence.dao.entity.Resource;

import java.util.List;
import java.util.Set;

/**
 * Created by Bravowhale on 2016/12/27.
 */
public interface ResourceService {
    /*
    * 得到资源所对应的权限字符串
    * */
    Set<String> findPermissions(Set<Long> resouceIds);

    /*
   * 根据用户权限得到菜单
   * */
    List<Resource> findMenus(Set<String> permissions);
}
