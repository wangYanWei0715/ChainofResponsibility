package com.chinahandler.demo.chinahandlerdemo.app.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (EcAppShare)实体类
 *
 * @author makejava
 * @since 2021-01-13 16:10:01
 */
public class EcAppShareEntity implements Serializable {
    private static final long serialVersionUID = -78598098965669508L;

    private String appShareId;

    private Date createTime;

    private String creator;

    private String downloadAddress;

    private String editor;

    private Object ifLatestVersion;

    private Date lastEditTime;

    private String description;

    private String title;


    public String getAppShareId() {
        return appShareId;
    }

    public void setAppShareId(String appShareId) {
        this.appShareId = appShareId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}