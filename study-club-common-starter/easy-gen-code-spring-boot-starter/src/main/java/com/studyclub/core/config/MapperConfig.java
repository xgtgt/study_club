package com.studyclub.core.config;

import com.studyclub.core.entity.Mapper;
import lombok.Data;

import java.util.List;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: 模板与生成文件的映射关系
 * @Version: 1.0
 */
@Data
public class MapperConfig {

    /**
     * 文件生成到该项目的哪个模块
     */
    private String module;

    /**
     * 映射关系
     */
    private List<Mapper> mappers;

}
