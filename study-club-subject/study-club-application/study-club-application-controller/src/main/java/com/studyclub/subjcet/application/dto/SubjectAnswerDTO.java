package com.studyclub.subjcet.application.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-16
 * @Description:
 * @Version: 1.0
 */
@Data
public class SubjectAnswerDTO implements Serializable {

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
