package com.studyclub.subjcet.application.convert;

import com.studyclub.subjcet.application.dto.SubjectLabelDTO;
import com.studyclub.subject.domain.entity.SubjectLabelBO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-28T18:02:04+1000",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_422 (Amazon.com Inc.)"
)
public class SubjectLabelDTOConverterImpl implements SubjectLabelDTOConverter {

    @Override
    public SubjectLabelBO convertDtoToLabelBO(SubjectLabelDTO subjectLabelDTO) {
        if ( subjectLabelDTO == null ) {
            return null;
        }

        SubjectLabelBO subjectLabelBO = new SubjectLabelBO();

        subjectLabelBO.setId( subjectLabelDTO.getId() );
        subjectLabelBO.setLabelName( subjectLabelDTO.getLabelName() );
        subjectLabelBO.setSortNum( subjectLabelDTO.getSortNum() );
        subjectLabelBO.setCategoryId( subjectLabelDTO.getCategoryId() );

        return subjectLabelBO;
    }

    @Override
    public List<SubjectLabelDTO> convertBOToLabelDTOList(List<SubjectLabelBO> boList) {
        if ( boList == null ) {
            return null;
        }

        List<SubjectLabelDTO> list = new ArrayList<SubjectLabelDTO>( boList.size() );
        for ( SubjectLabelBO subjectLabelBO : boList ) {
            list.add( subjectLabelBOToSubjectLabelDTO( subjectLabelBO ) );
        }

        return list;
    }

    protected SubjectLabelDTO subjectLabelBOToSubjectLabelDTO(SubjectLabelBO subjectLabelBO) {
        if ( subjectLabelBO == null ) {
            return null;
        }

        SubjectLabelDTO subjectLabelDTO = new SubjectLabelDTO();

        subjectLabelDTO.setId( subjectLabelBO.getId() );
        subjectLabelDTO.setCategoryId( subjectLabelBO.getCategoryId() );
        subjectLabelDTO.setLabelName( subjectLabelBO.getLabelName() );
        subjectLabelDTO.setSortNum( subjectLabelBO.getSortNum() );

        return subjectLabelDTO;
    }
}
