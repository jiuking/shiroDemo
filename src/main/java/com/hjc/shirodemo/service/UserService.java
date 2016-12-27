package com.hjc.shirodemo.service;

import com.hjc.shirodemo.persistence.dao.entity.User;

import java.util.List;
import java.util.Set;

/**
 * Created by Bravowhale on 2016/12/27.
 */
public interface UserService {

    public int createUser(User user);

    public int updateUser(User user);

    public void deleteUser(Long id);

    public User findOne(Long id);

    public List<User> findAll();

    /*
    * 修改密码
    * */
    public void changePassword(Long userId,String newPassword);

    /*
    * 根据用户名查找用户
    * */
    public User findByUsername(String username);

    /*
    * 根据用户名查找角色
    * */
    public Set<String> findRoles(String username);

    /*
    *根据用户名查找其权限
    * */
    public Set<String> findPermissions(String username);
}
