package com.hjc.shirodemo.service.impl;

import com.hjc.shirodemo.persistence.dao.OrganizationDao;
import com.hjc.shirodemo.persistence.dao.entity.Organization;
import com.hjc.shirodemo.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Bravowhale on 2016/12/27.
 */
public class OrganiztionServiceImpl implements OrganizationService{

    @Autowired
    private OrganizationDao organizationDao;

    public int createOrganization(Organization organization) {
        return organizationDao.insertSelective(organization);
    }

    public int updateOrganization(Organization organization) {
        return organizationDao.updateByPrimaryKeySelective(organization);
    }

    public void deleteOrganization(Long organizationId) {
        organizationDao.deleteByPrimaryKey(organizationId);
    }

    public Organization findOne(Long organizationId) {
        return organizationDao.selectByPrimaryKey(organizationId);
    }

    public List<Organization> findAll() {
        return organizationDao.findAll();
    }

    public Object findAllWithExclude(Long id,String parents) {
        return organizationDao.findAllWithExclude(id,parents);
    }

    public void move(Organization source, Organization target) {
        organizationDao.updateByPrimaryKey(source);
        organizationDao.updateByPrimaryKey(target);
    }
}
