package com.hjc.shirodemo.persistence.dao.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{

    private static final long serialVersionUID = 7078673503578008078L;

    private Long id; //编号

    private Long organizationId; //所属公司

    private String username; //用户名

    private String password; //密码

    private String salt; //加密密码的盐

    private List<Long> roleIds; //拥有的角色列表

    private Boolean locked = Boolean.FALSE;

    public User(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getCredentialsSalt() {
        return username + salt;
    }

    public List<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Long> roleIds) {
        this.roleIds = roleIds;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
}