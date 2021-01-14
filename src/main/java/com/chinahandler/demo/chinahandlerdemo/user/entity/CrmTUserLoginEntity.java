package com.chinahandler.demo.chinahandlerdemo.user.entity;

import java.io.Serializable;

/**
 * (CrmTUserLogin)实体类
 *
 * @author makejava
 * @since 2021-01-13 15:57:54
 */
public class CrmTUserLoginEntity implements Serializable {
    private static final long serialVersionUID = -79447326103225735L;

    private String rowId;

    private String openId;

    private String unionId;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

}