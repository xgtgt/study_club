package com.studyclub.core.entity;

import lombok.Data;

/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: 映射关系
 * @Version: 1.0
 */
@Data
public class Mapper {

    /**
     * 生成文件的id
     */
    private String fileId;

    /**
     * 模板地址
     */
    private String template;

    /**
     * 生成类包名称 可使用占位符 ${}
     */
    private String packageName;

    /**
     * 生成文件的路径 没有指定则用 packageName 进行替换处理 可使用占位符 ${}
     */
    private String filePath;

    /**
     * 生成文件的名称 可使用占位符 ${}
     */
    private String name;

    /**
     * 生成文件的扩展名
     */
    private String ext;
}
