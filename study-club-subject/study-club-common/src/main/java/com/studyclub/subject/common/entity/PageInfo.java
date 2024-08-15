package com.studyclub.subject.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-16
 * @Description: 分页请求实体
 * @Version: 1.0
 */
@Data
public class PageInfo implements Serializable {

    private Integer pageNo = 1;

    private Integer pageSize = 20;

    public Integer getPageNo() {
        if (pageNo == null || pageNo < 1) {
            return 1;
        }
        return pageNo;
    }

    public Integer getPageSize() {
        if (pageSize == null || pageSize < 1 || pageSize > Integer.MAX_VALUE) {
            return 20;
        }
        return pageSize;
    }

}
