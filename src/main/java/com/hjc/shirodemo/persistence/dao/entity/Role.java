package com.hjc.shirodemo.persistence.dao.entity;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable{

    private static final long serialVersionUID = 3707812797039526628L;

    private Long id;//编号

    private String role; //角色标识 程序中判断使用,如"admin"

    private String description; //角色描述,UI界面显示使用

    private String resourceIds; //拥有的资源

    private Boolean available = Boolean.FALSE; //是否可用,如果不可用将不会添加给用户

    public Role(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}