package com.studyclub.subjcet.application.controller;

import com.studyclub.subject.infra.basic.entity.SubjectCategory;
import com.studyclub.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-08
 * @Description: 刷题模块Controller
 * @Version: 1.0
 */
@RestController
public class SubjectController {

    @Resource
    private SubjectCategoryService subjectCategoryService;

    @GetMapping("/test")
    public String test(){
        SubjectCategory subjectCategory = subjectCategoryService.queryById(1L);
        return subjectCategory.getCategoryName();
    }
}
