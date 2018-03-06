package com.hjc.shirodemo.service;

import com.hjc.shirodemo.persistence.dao.entity.Organization;
import java.util.List;

/**
 * Created by Bravowhale on 2016/12/27.
 */
public interface OrganizationService{
    /**
     * @Author: hjc
     * @Description: 创建组织
     * @param: organization
     * @Date: 14:08 2018/3/5 0005
     * @return: int
     * @throws:
     */
    public int createOrganization(Organization organization);

    /**
     * @Author: hjc
     * @Description: 更新组织
     * @param: organization
     * @Date: 14:08 2018/3/5 0005
     * @return: int
     * @throws:
     */
    public int updateOrganization(Organization organization);

    /**
     * @Author: hjc
     * @Description: 删除组织
     * @param: organizationId
     * @Date: 14:09 2018/3/5 0005
     * @return: void
     * @throws:
     */
    public void deleteOrganization(Long organizationId);

    /**
     * @Author: hjc
     * @Description: 根据组织id查找组织
     * @param: organizationId
     * @Date: 14:09 2018/3/5 0005
     * @return: com.hjc.shirodemo.persistence.dao.entity.Organization
     * @throws:
     */
    Organization findOne(Long organizationId);

    /**
     * @Author: hjc
     * @Description: 查找所有组织
     * @param:
     * @Date: 14:10 2018/3/5 0005
     * @return: java.util.List<com.hjc.shirodemo.persistence.dao.entity.Organization>
     * @throws:
     */
    List<Organization> findAll();

    /**
     * @Author: hjc
     * @Description: 查找排除之外的组织
     * @param: id
     * @param: parents
     * @Date: 14:11 2018/3/5 0005
     * @return: java.lang.Object
     * @throws:
     */
    Object findAllWithExclude(Long id,String parents);

    /**
     * @Author: hjc
     * @Description: 移动组织
     * @param: source
     * @param: target
     * @Date: 14:11 2018/3/5 0005
     * @return: void
     * @throws:
     */
    void move(Organization source,Organization target);
}
