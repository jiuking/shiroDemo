package com.hjc.shirodemo.service.impl;

import com.hjc.shirodemo.persistence.dao.UserDao;
import com.hjc.shirodemo.persistence.dao.entity.User;
import com.hjc.shirodemo.service.RoleService;
import com.hjc.shirodemo.service.UserService;
import com.hjc.shirodemo.util.PasswordHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by Bravowhale on 2016/12/27.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordHelper passwordHelper;

    @Autowired
    private RoleService roleService;

    public int createUser(User user) {
        //加密密码
        passwordHelper.encryptPassword(user);
        return userDao.insert(user);
    }

    public int updateUser(User user) {
        return userDao.updateByPrimaryKeySelective(user);
    }

    public void deleteUser(Long id) {
        userDao.deleteByPrimaryKey(id);
    }

    public User findOne(Long id) {
        return userDao.selectByPrimaryKey(id);
    }

    public List<User> findAll() {
        return null;
    }

    public void changePassword(Long userId, String newPassword) {
        User user = findOne(userId);
        user.setPassword(newPassword);

        userDao.updateByPrimaryKeySelective(user);
    }

    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    public Set<String> findRoles(String username) {
        User user = findByUsername(username);
        if(user == null)
            return Collections.EMPTY_SET;
        return roleService.findRoles(user.getRoleIds().toArray(new Long[0]));
    }

    public Set<String> findPermissions(String username) {
        User user = findByUsername(username);
        if(user == null)
            return Collections.EMPTY_SET;
        return roleService.findPermissions(user.getRoleIds().toArray(new Long[0]));
    }
}
