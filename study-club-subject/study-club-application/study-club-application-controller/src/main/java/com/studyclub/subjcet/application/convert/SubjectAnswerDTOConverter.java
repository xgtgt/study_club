package com.studyclub.subjcet.application.convert;

import com.studyclub.subjcet.application.dto.SubjectAnswerDTO;
import com.studyclub.subject.domain.entity.SubjectAnswerBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-16
 * @Description:
 * @Param: $
 * @return: $
 */
@Mapper
public interface SubjectAnswerDTOConverter {

    SubjectAnswerDTOConverter INSTANCE = Mappers.getMapper(SubjectAnswerDTOConverter.class);

    SubjectAnswerBO convertDTOBO(SubjectAnswerDTO subjectAnswerDTO);

    List<SubjectAnswerBO> convertListDTOToBO(List<SubjectAnswerDTO> dtoList);

}
