package com.studyclub.subject.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-16
 * @Description:
 * @Version: 1.0
 */
@Data
public class SubjectOptionBO implements Serializable {

    /**
     * 题目答案
     */
    private String subjectAnswer;

    /**
     * 答案选项
     */
    private List<SubjectAnswerBO> optionList;

}

