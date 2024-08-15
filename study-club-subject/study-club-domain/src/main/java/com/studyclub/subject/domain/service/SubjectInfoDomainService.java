package com.studyclub.subject.domain.service;

import com.studyclub.subject.common.entity.PageResult;
import com.studyclub.subject.domain.entity.SubjectInfoBO;

import java.util.List;

/**
* @Author: xgt
* @CreateTime: 2024-08-16
* @Description:
* @Param: $
* @return: $
*/
public interface SubjectInfoDomainService {

    /**
     * 新增题目
     */
    void add(SubjectInfoBO subjectInfoBO);

    /**
     * 分页查询
     */
    PageResult<SubjectInfoBO> getSubjectPage(SubjectInfoBO subjectInfoBO);

    /**
     * 查询题目信息
     */
    SubjectInfoBO querySubjectInfo(SubjectInfoBO subjectInfoBO);


    List<SubjectInfoBO> getContributeList();
}
