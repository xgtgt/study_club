package com.studyclub.core.utils;

import com.studyclub.core.core.MysqlDataHandler;
import com.studyclub.core.entity.JdbcConfig;
import com.studyclub.core.entity.TableInfo;

import java.util.List;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: jdbc工具 用于查询表字段信息 及 表结构信息
 * @Version: 1.0
 */
public class JdbcUtil {

    private JdbcUtil() {
    }

    public static List<TableInfo> queryTableInfo(JdbcConfig config, String table) {

        return new MysqlDataHandler(table, config.getUrl(), config.getUsername(),
                config.getPassword(), config.getDbName(), config.getDriver())
                .searchByDb();

    }

    public static String getComment(JdbcConfig config, String table) {

        return new MysqlDataHandler(table, config.getUrl(), config.getUsername(),
                config.getPassword(), config.getDbName(), config.getDriver())
                .getTableComment();

    }

}
