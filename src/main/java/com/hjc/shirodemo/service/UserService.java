package com.hjc.shirodemo.service;

import com.hjc.shirodemo.persistence.dao.entity.User;

import java.util.List;
import java.util.Set;

/**
 * Created by Bravowhale on 2016/12/27.
 */
public interface UserService {

    /**
     * @Author: hjc
     * @Description: 创建用户
     * @param: user
     * @Date: 14:05 2018/3/5 0005
     * @return: int
     * @throws:
     */
    int createUser(User user);

    /**
     * @Author: hjc
     * @Description: 更新用户
     * @param: user
     * @Date: 14:05 2018/3/5 0005
     * @return: int
     * @throws:
     */
    int updateUser(User user);

    /**
     * @Author: hjc
     * @Description: 删除用户
     * @param: id
     * @Date: 14:06 2018/3/5 0005
     * @return: void
     * @throws:
     */
    void deleteUser(Long id);

    /**
     * @Author: hjc
     * @Description: 根据id查找用户
     * @param: id
     * @Date: 14:06 2018/3/5 0005
     * @return: com.hjc.shirodemo.persistence.dao.entity.User
     * @throws:
     */
    User findOne(Long id);

    /**
     * @Author: hjc
     * @Description: 查找所有用户
     * @param:
     * @Date: 14:06 2018/3/5 0005
     * @return: java.util.List<com.hjc.shirodemo.persistence.dao.entity.User>
     * @throws:
     */
    List<User> findAll();

    /**
     * @Author: hjc
     * @Description: 修改密码
     * @param: userId
     * @param: newPassword
     * @Date: 14:03 2018/3/5 0005
     * @return: void
     * @throws:
     */
    void changePassword(Long userId,String newPassword);

    /**
     * @Author: hjc
     * @Description: 根据用户名查找用户
     * @param: username
     * @Date: 14:04 2018/3/5 0005
     * @return: com.hjc.shirodemo.persistence.dao.entity.User
     * @throws:
     */
    User findByUsername(String username);

    /**
     * @Author: hjc
     * @Description: 根据用户名查找角色
     * @param: username
     * @Date: 14:04 2018/3/5 0005
     * @return: java.util.Set<java.lang.String>
     * @throws:
     */
    Set<String> findRoles(String username);

    /**
     * @Author: hjc
     * @Description: 根据用户名查找其权限
     * @param: username
     * @Date: 14:05 2018/3/5 0005
     * @return: java.util.Set<java.lang.String>
     * @throws:
     */
    Set<String> findPermissions(String username);
}
