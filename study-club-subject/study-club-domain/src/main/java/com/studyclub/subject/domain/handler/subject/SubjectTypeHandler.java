package com.studyclub.subject.domain.handler.subject;

import com.studyclub.subject.common.enums.SubjectInfoTypeEnum;
import com.studyclub.subject.domain.entity.SubjectInfoBO;
import com.studyclub.subject.domain.entity.SubjectOptionBO;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-16
 * @Description:
 * @Param: $
 * @return: $
 */
public interface SubjectTypeHandler {

    /**
     * 枚举身份的识别
     */
    SubjectInfoTypeEnum getHandlerType();

    /**
     * 实际题目的插入
     */
    void add(SubjectInfoBO subjectInfoBO);

    /**
     * 实际的题目的查询
     */
    SubjectOptionBO query(int subjectId);
}
