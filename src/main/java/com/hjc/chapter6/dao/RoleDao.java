package com.hjc.chapter6.dao;

import com.hjc.chapter6.entity.Role;

public interface RoleDao {
    Role createRole(Role role);

    void deleteRole(Long roleId);

    void correlationPermissions(Long roleId, Long... permissionIds);

    void uncorrelationPermissions(Long roleId, Long... permissionIds);
}
