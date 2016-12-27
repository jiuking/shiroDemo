package com.hjc.shirodemo.persistence.dao;

import com.hjc.shirodemo.persistence.dao.entity.Organization;

public interface SysOrganizationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Organization record);

    int insertSelective(Organization record);

    Organization selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);
}