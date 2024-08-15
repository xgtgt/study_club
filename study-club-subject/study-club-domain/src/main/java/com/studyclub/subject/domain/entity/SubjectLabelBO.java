package com.studyclub.subject.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-14
 * @Description:
 * @Version: 1.0
 */
@Data
public class SubjectLabelBO implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 标签分类
     */
    private String labelName;

    /**
     * 排序
     */
    private Integer sortNum;

    /**
     * 分类id
     */
    private Long categoryId;

}
