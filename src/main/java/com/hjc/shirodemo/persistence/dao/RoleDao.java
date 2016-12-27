package com.hjc.shirodemo.persistence.dao;

import com.hjc.shirodemo.persistence.dao.entity.Role;

public interface RoleDao {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}