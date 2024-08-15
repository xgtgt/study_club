package com.studyclub.subject.domain.service;

import com.studyclub.subject.domain.entity.SubjectLabelBO;

import java.util.List;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-15
 * @Description: 题目标签领域服务
 * @Version: 1.0
 */
public interface SubjectLabelDomainService {

    /**
     * 新增标签
     */
    Boolean add(SubjectLabelBO subjectLabelBO);

    /**
     * 更新标签
     */
    Boolean update(SubjectLabelBO subjectLabelBO);

    /**
     * 删除标签
     */
    Boolean delete(SubjectLabelBO subjectLabelBO);

    /**
     * 查询分类下标签
     */
    List<SubjectLabelBO> queryLabelByCategoryId(SubjectLabelBO subjectLabelBO);

}
