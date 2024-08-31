package com.studyclub.oss.entity;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-23
 * @Description: 文件类
 * @Version: 1.0
 */
public class FileInfo {

    private String fileName;

    private Boolean directoryFlag;

    private String etag;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Boolean getDirectoryFlag() {
        return directoryFlag;
    }

    public void setDirectoryFlag(Boolean directoryFlag) {
        this.directoryFlag = directoryFlag;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }
}
