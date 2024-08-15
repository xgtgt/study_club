package com.studyclub.subject.domain.entity;

import lombok.Data;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-16
 * @Description:
 * @Version: 1.0
 */
@Data
public class SubjectAnswerBO {

    /**
     * 答案选项标识
     */
    private Integer optionType;

    /**
     * 答案
     */
    private String optionContent;

    /**
     * 是否正确
     */
    private Integer isCorrect;
}
