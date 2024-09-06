package com.studyclub.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: 数据库配置
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JdbcConfig {

    private String url;
    private String username;
    private String password;
    private String dbName;
    private String driver;
    private String tableName;

}