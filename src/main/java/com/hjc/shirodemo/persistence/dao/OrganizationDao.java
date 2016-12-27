package com.hjc.shirodemo.persistence.dao;

import com.hjc.shirodemo.persistence.dao.entity.Organization;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrganizationDao {

    int deleteByPrimaryKey(Long id);

    int insert(Organization record);

    int insertSelective(Organization record);

    Organization selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);

    List<Organization> findAll();

    Object findAllWithExclude(@Param(value="id") Long id,@Param(value="parentIds")String parentIds);
}