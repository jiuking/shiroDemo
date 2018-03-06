package com.hjc.chapter6.dao;

import com.hjc.chapter6.entity.Permission;

public interface PermissionDao {
    Permission createPermission(Permission permission);

    void deletePermission(Long permissionId);

}
