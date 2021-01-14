package com.chinahandler.demo.chinahandlerdemo.app.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (EcAppVersion)实体类
 *
 * @author makejava
 * @since 2021-01-13 16:57:11
 */
public class EcAppVersionEntity implements Serializable {
    private static final long serialVersionUID = 509149027627721252L;

    private String appVersionId;

    private String appType;

    private Date createTime;

    private String creator;

    private String downloadAddress;

    private String editor;

    private Object ifLatestVersion;

    private Date lastEditTime;

    private String tipsMessage;

    private String versionCode;

    private String versionName;

    private Object ifForceUpdate;

    private Integer minVersionCode;


    public String getAppVersionId() {
        return appVersionId;
    }

    public void setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getDownloadAddress() {
        return downloadAddress;
    }

    public void setDownloadAddress(String downloadAddress) {
        this.downloadAddress = downloadAddress;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Object getIfLatestVersion() {
        return ifLatestVersion;
    }

    public void setIfLatestVersion(Object ifLatestVersion) {
        this.ifLatestVersion = ifLatestVersion;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getTipsMessage() {
        return tipsMessage;
    }

    public void setTipsMessage(String tipsMessage) {
        this.tipsMessage = tipsMessage;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Object getIfForceUpdate() {
        return ifForceUpdate;
    }

    public void setIfForceUpdate(Object ifForceUpdate) {
        this.ifForceUpdate = ifForceUpdate;
    }

    public Integer getMinVersionCode() {
        return minVersionCode;
    }

    public void setMinVersionCode(Integer minVersionCode) {
        this.minVersionCode = minVersionCode;
    }

}