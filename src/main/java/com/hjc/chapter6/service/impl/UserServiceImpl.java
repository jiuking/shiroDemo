package com.hjc.chapter6.service.impl;

import com.hjc.chapter6.entity.User;
import com.hjc.chapter6.service.UserService;

import java.util.Set;

public class UserServiceImpl implements UserService {

    public User createUser(User user) {
        return null;
    }

    public void changePassword(Long userId, String newPassword) {

    }

    public void correlationRoles(Long userId, Long... roleIds) {

    }

    public void uncorrelationRoles(Long userId, Long... roleIds) {

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
