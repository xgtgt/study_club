package com.studyclub.core.config;

import com.studyclub.core.entity.JdbcConfig;
import lombok.Data;

import java.util.Map;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: 代码生成器配置
 * @Version: 1.0
 */
@Data
public class GenConfig {

    /**
     * 从自定义的类中获取数据
     */
    private String handler;

    /**
     * 从classPath下的json文件中获取数据
     */
    private String json;

    /**
     * 使用jdbc从表结构中获取数据
     */
    private JdbcConfig jdbc;

    /**
     * 模板与生成文件的映射配置文件
     */
    private String mapperInfos;

    /**
     * 针对某一个模板将数据写入该模板上下文
     */
    private String filePutHandler;

    /**
     * 自定义写入全局的参数
     */
    private Map<String, Object> params;

}
