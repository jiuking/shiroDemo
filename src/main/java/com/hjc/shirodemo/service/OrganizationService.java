package com.hjc.shirodemo.service;

import com.hjc.shirodemo.persistence.dao.entity.Organization;

import java.util.List;

/**
 * Created by Bravowhale on 2016/12/27.
 */
public interface OrganizationService{
    public int createOrganization(Organization organization);
    public Organization updateOrganization(Organization organization);
    public void deleteOrganization(Long organizationId);
    Organization findOne(Long organizationId);
    List<Organization> findAll();
    Object findAllWithExclude(Organization excludeOrganization);
    void move(Organization source,Organization target);
}
