package com.studyclub.subject.domain.service.impl;

import com.alibaba.fastjson.JSON;
import com.studyclub.subject.common.entity.PageResult;
import com.studyclub.subject.domain.entity.SubjectInfoBO;
import com.studyclub.subject.domain.service.SubjectInfoDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-16
 * @Description:
 * @Version: 1.0
 */
@Service
@Slf4j
public class SubjectInfoDomainServiceImpl implements SubjectInfoDomainService {
    @Override
    public void add(SubjectInfoBO subjectInfoBO) {
        if (log.isInfoEnabled()) {
            log.info("SubjectInfoDomainServiceImpl.add.bo:{}", JSON.toJSONString(subjectInfoBO));
        }
    }

    @Override
    public PageResult<SubjectInfoBO> getSubjectPage(SubjectInfoBO subjectInfoBO) {
        return null;
    }

    @Override
    public SubjectInfoBO querySubjectInfo(SubjectInfoBO subjectInfoBO) {
        return null;
    }

    @Override
    public List<SubjectInfoBO> getContributeList() {
        return null;
    }
}
