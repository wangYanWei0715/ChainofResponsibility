package com.chinahandler.demo.chinahandlerdemo.user.entity;

import java.io.Serializable;

/**
 * (CrmTWechatUser)实体类
 *
 * @author makejava
 * @since 2021-01-13 16:03:41
 */
public class CrmTWechatUserEntity implements Serializable {
    private static final long serialVersionUID = 858423845572536598L;

    private String userId;

    private String openId;

    private String unionId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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