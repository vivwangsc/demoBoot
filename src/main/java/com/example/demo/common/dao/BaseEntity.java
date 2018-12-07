package com.example.demo.common.dao;

import javax.persistence.*;

/**
 * Created by wsc on 2017/9/27.
 * 定义蓝智统一数据的格式
 * 所有表包含三个基本字段
 */
@MappedSuperclass
public class BaseEntity {
    /**
     * 主键信息
     */
    @Id
    @Column(name = "id")
    private String id;
    /**
     * 数据版本号信息，控制数据的并发修改
     */
    @Version
    @Column(name = "version")
    private Integer version;
    /**
     * 扩展信息，应付以后增添数据的一些扩充字段内容
     */
    @Basic
    @Column(name = "extInfo")
    private String  extInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

}
