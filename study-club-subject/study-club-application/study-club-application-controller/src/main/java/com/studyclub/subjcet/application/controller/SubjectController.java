package com.studyclub.subjcet.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.studyclub.subjcet.application.convert.SubjectAnswerDTOConverter;
import com.studyclub.subjcet.application.convert.SubjectInfoDTOConverter;
import com.studyclub.subjcet.application.dto.SubjectInfoDTO;
import com.studyclub.subject.common.entity.Result;
import com.studyclub.subject.domain.entity.SubjectAnswerBO;
import com.studyclub.subject.domain.entity.SubjectInfoBO;
import com.studyclub.subject.domain.service.SubjectInfoDomainService;
import com.studyclub.subject.infra.basic.entity.SubjectCategory;
import com.studyclub.subject.infra.basic.service.SubjectCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-08
 * @Description: 刷题模块Controller
 * @Version: 1.0
 */
@RestController
@Slf4j
@RequestMapping("/subject")
public class SubjectController {

    @Resource
    private SubjectInfoDomainService subjectInfoDomainService;


    /**
     * 新增题目
     */
    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody SubjectInfoDTO subjectInfoDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("SubjectController.add.dto:{}", JSON.toJSONString(subjectInfoDTO));
            }
            Preconditions.checkArgument(!StringUtils.isBlank(subjectInfoDTO.getSubjectName()),
                    "题目名称不能为空");
            Preconditions.checkNotNull(subjectInfoDTO.getSubjectDifficult(), "题目难度不能为空");
            Preconditions.checkNotNull(subjectInfoDTO.getSubjectType(), "题目类型不能为空");
            Preconditions.checkNotNull(subjectInfoDTO.getSubjectScore(), "题目分数不能为空");
            Preconditions.checkArgument(!CollectionUtils.isEmpty(subjectInfoDTO.getCategoryIds())
                    , "分类id不能为空");
            Preconditions.checkArgument(!CollectionUtils.isEmpty(subjectInfoDTO.getLabelIds())
                    , "标签id不能为空");

            SubjectInfoBO subjectInfoBO = SubjectInfoDTOConverter.INSTANCE.convertDTOToBO(subjectInfoDTO);
            List<SubjectAnswerBO> subjectAnswerBOS =
                    SubjectAnswerDTOConverter.INSTANCE.convertListDTOToBO(subjectInfoDTO.getOptionList());
            subjectInfoBO.setOptionList(subjectAnswerBOS);
            subjectInfoDomainService.add(subjectInfoBO);
            return Result.ok(true);
        } catch (Exception e) {
            log.error("SubjectCategoryController.add.error:{}", e.getMessage(), e);
            return Result.fail("新增题目失败");
        }
    }

}
