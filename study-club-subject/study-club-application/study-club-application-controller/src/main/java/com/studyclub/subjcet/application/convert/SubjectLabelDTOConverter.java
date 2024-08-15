package com.studyclub.subjcet.application.convert;

import com.studyclub.subjcet.application.dto.SubjectLabelDTO;
import com.studyclub.subject.domain.entity.SubjectLabelBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-14
 * @Description:
 * @Param: $
 * @return: $
 */
@Mapper
public interface SubjectLabelDTOConverter {

    SubjectLabelDTOConverter INSTANCE = Mappers.getMapper(SubjectLabelDTOConverter.class);

    SubjectLabelBO convertDtoToLabelBO(SubjectLabelDTO subjectLabelDTO);

    List<SubjectLabelDTO> convertBOToLabelDTOList(List<SubjectLabelBO> boList);

}
