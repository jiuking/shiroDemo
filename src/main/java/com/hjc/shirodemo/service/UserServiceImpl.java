package com.hjc.shirodemo.service;

import com.hjc.shirodemo.persistence.dao.entity.User;

import java.util.Set;

/**
 * Created by Bravowhale on 2016/12/27.
 */
public class UserServiceImpl implements UserServcie{

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
