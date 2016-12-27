package com.hjc.shirodemo.persistence.dao;

import com.hjc.shirodemo.persistence.dao.entity.Resource;

public interface SysResourceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}