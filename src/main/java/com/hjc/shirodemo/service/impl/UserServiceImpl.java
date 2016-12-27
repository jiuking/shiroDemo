package com.hjc.shirodemo.service.impl;

import com.hjc.shirodemo.persistence.dao.entity.User;
import com.hjc.shirodemo.service.UserService;

import java.util.Set;

/**
 * Created by Bravowhale on 2016/12/27.
 */
public class UserServiceImpl implements UserService {

    public void changePassword(Long userId, String newPassword) {

    }

    public User findByUsername(String username) {
        return null;
    }

    public Set<String> findRoles(String username) {
        return null;
    }

    public Set<String> findPermissions(String username) {
        return null;
    }
}
