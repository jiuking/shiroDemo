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

    public Organization updateOrganization(Organization organization) {
        return null;
    }

    public void deleteOrganization(Long organizationId) {

    }

    public Organization findOne(Long organizationId) {
        return null;
    }

    public List<Organization> findAll() {
        return null;
    }

    public Object findAllWithExclude(Organization excludeOrganization) {
        return null;
    }

    public void move(Organization source, Organization target) {

    }
}
