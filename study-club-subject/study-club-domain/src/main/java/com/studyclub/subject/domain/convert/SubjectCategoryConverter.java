package com.studyclub.subject.domain.convert;

import com.studyclub.subject.domain.entity.SubjectCategoryBO;
import com.studyclub.subject.infra.basic.entity.SubjectCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-10
 * @Description:
 * @Param: $
 * @return: $
 */

@Mapper
public interface SubjectCategoryConverter {

    SubjectCategoryConverter INSTANCE = Mappers.getMapper(SubjectCategoryConverter.class);

    SubjectCategory convertBoToCategory(SubjectCategoryBO subjectCategoryBO);

    List<SubjectCategoryBO> convertBoToCategory(List<SubjectCategory> categoryList);


}
