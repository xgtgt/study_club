package com.studyclub.subject.infra.basic.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-15
 * @Description: 题目标签表(SubjectLabel)实体类
 * @Version: 1.0
 */
@Data
public class SubjectLabel implements Serializable {

    /**
     * 主键
     */
    private Long id;
    /**
     * 标签分类
     */
    private String labelName;
    /**
     * 分类id
     */
    private Long categoryId;
    /**
     * 排序
     */
    private Integer sortNum;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新人
     */
    private String updateBy;
    
    private Integer isDeleted;
    /**
     * 更新时间
     */
    private Date updateTime;

}

