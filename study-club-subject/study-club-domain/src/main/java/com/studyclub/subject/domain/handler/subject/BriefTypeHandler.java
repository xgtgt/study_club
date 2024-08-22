package com.studyclub.subject.domain.handler.subject;

import com.studyclub.subject.common.enums.IsDeletedFlagEnum;
import com.studyclub.subject.common.enums.SubjectInfoTypeEnum;
import com.studyclub.subject.domain.convert.BriefSubjectConverter;
import com.studyclub.subject.domain.entity.SubjectInfoBO;
import com.studyclub.subject.domain.entity.SubjectOptionBO;
import com.studyclub.subject.infra.basic.entity.SubjectBrief;
import com.studyclub.subject.infra.basic.service.SubjectBriefService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-16
 * @Description:简答题目策略类
 * @Version: 1.0
 */
@Component
public class BriefTypeHandler implements SubjectTypeHandler{

    @Resource
    private SubjectBriefService subjectBriefService;
    
    @Override
    public SubjectInfoTypeEnum getHandlerType() {
        return SubjectInfoTypeEnum.BRIEF;
    }

    @Override
    public void add(SubjectInfoBO subjectInfoBO) {
        SubjectBrief subjectBrief = BriefSubjectConverter.INSTANCE.convertBoToEntity(subjectInfoBO);
        subjectBrief.setSubjectId(subjectInfoBO.getId().intValue());
        subjectBrief.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        subjectBriefService.insert(subjectBrief);
    }

    @Override
    public SubjectOptionBO query(int subjectId) {
        SubjectBrief subjectBrief = new SubjectBrief();
        subjectBrief.setSubjectId(subjectId);
        SubjectBrief result = subjectBriefService.queryByCondition(subjectBrief);
        SubjectOptionBO subjectOptionBO = new SubjectOptionBO();
        subjectOptionBO.setSubjectAnswer(result.getSubjectAnswer());
        return subjectOptionBO;
    }
}
