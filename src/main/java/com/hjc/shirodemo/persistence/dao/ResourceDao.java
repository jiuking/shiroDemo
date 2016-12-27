package com.hjc.shirodemo.persistence.dao;

import com.hjc.shirodemo.persistence.dao.entity.Resource;

import java.util.List;
import java.util.Set;

public interface ResourceDao {
    int deleteByPrimaryKey(Long id);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);

    List<Resource> findAll();

    Set<String> findPermissions(Set<Long> resouceIds);

    List<Resource> findMenus(Set<String> permissions);
}