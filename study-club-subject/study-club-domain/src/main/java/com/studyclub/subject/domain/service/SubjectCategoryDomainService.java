package com.studyclub.subject.domain.service;

import com.studyclub.subject.domain.entity.SubjectCategoryBO;

import java.util.List;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-10
 * @Description:
 * @Version: 1.0
 */
public interface SubjectCategoryDomainService {

    /**
     * 新增分类
     * @param subjectCategoryBO
     */
    void add(SubjectCategoryBO subjectCategoryBO);

    /**
     * 查询分类
     * @param subjectCategoryBO
     * @return
     */
    List<SubjectCategoryBO> queryCategory(SubjectCategoryBO subjectCategoryBO);

    /**
     * 更新分类
     * @param subjectCategoryBO
     * @return
     */
    Boolean update(SubjectCategoryBO subjectCategoryBO);

    /**
     * 删除分类
     * @param subjectCategoryBO
     * @return
     */
    Boolean delete(SubjectCategoryBO subjectCategoryBO);

}

