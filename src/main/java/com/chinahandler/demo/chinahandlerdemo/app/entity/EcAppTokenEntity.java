package com.chinahandler.demo.chinahandlerdemo.app.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (EcAppToken)实体类
 *
 * @author makejava
 * @since 2021-01-13 16:56:56
 */
public class EcAppTokenEntity implements Serializable {
    private static final long serialVersionUID = 306256091430793012L;

    private String appTokenId;

    private Date createTime;

    private String deviceId;

    private String tokenId;


    public String getAppTokenId() {
        return appTokenId;
    }

    public void setAppTokenId(String appTokenId) {
        this.appTokenId = appTokenId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

}