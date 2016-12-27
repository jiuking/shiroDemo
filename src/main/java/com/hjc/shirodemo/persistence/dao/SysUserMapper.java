package com.hjc.shirodemo.persistence.dao;

import com.hjc.shirodemo.persistence.dao.entity.User;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}