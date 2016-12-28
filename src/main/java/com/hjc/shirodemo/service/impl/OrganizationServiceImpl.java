package com.hjc.shirodemo.service.impl;

import com.hjc.shirodemo.persistence.dao.OrganizationDao;
import com.hjc.shirodemo.persistence.dao.entity.Organization;
import com.hjc.shirodemo.service.OrganizationService;
import net.sf.ehcache.search.expression.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Bravowhale on 2016/12/27.
 */
@Service
public class OrganizationServiceImpl implements OrganizationService{

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
        Organization organization = new Organization();
        organization.setId(source.getId());
        organization.setParentId(target.getParentId());
        organization.setParentIds(target.getParentIds());
        organizationDao.updateByPrimaryKeySelective(organization);

        organizationDao.moveSourceDescendants(
                target.makeSelfAsParentIds(),
                source.makeSelfAsParentIds(),
                source.makeSelfAsParentIds() + "%");
    }
}
