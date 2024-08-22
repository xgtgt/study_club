package com.studyclub.subjcet.application.convert;

import com.studyclub.subjcet.application.dto.SubjectInfoDTO;
import com.studyclub.subject.domain.entity.SubjectInfoBO;
import com.studyclub.subject.infra.basic.entity.SubjectInfo;
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
public interface SubjectInfoDTOConverter {

    SubjectInfoDTOConverter INSTANCE = Mappers.getMapper(SubjectInfoDTOConverter.class);

    SubjectInfoBO convertDTOToBO(SubjectInfoDTO subjectInfoDTO);

    SubjectInfoDTO convertBOToDTO(SubjectInfoBO boResult);

    List<SubjectInfoDTO> convertBOToDTOList(List<SubjectInfoBO> subjectInfoBO);


}
