package com.hjc.chapter6.service;

import org.apache.shiro.authz.Permission;

public interface PermissionService {
    Permission createPermission(Permission permission);

    void deletePermission(long permissionId);
}
