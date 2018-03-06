package com.hjc.chapter6.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class Permission implements Serializable {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String permission; //权限标识 程序中判断使用,如"user:create"

    @Getter
    @Setter
    private String description; //权限描述,UI界面显示使用

    @Getter
    @Setter
    private Boolean available = Boolean.FALSE; //是否可用,如果不可用将不会添加给用户

    public Permission() {
    }

    public Permission(String permission, String description, Boolean available) {
        this.permission = permission;
        this.description = description;
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Permission role = (Permission) o;

        if (id != null ? !id.equals(role.id) : role.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", permission='" + permission + '\'' +
                ", description='" + description + '\'' +
                ", available=" + available +
                '}';
    }
}
