package com.hjc.shirodemo.persistence.dao.entity;

import java.io.Serializable;

public class Organization implements Serializable{

    private static final long serialVersionUID = 6295411855675336174L;

    private Long id;//编号

    private String name; //组织机构名称

    private Long parentId; //父编号

    private String parentIds; //父编号列表，如1/2/

    private Boolean available = Boolean.FALSE;

    public Organization(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public boolean isRootNode(){
        return parentId == 0;
    }

    public String makeSelfAsParentIds(){
        return getParentIds()+getId()+"/";
    }
}