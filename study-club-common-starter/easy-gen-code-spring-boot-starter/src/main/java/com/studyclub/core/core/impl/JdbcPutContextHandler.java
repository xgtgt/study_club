package com.studyclub.core.core.impl;

import com.studyclub.core.config.GenConfig;
import com.studyclub.core.core.sdk.PutContextHandler;
import com.studyclub.core.entity.TableInfo;
import com.studyclub.core.utils.JdbcUtil;
import com.studyclub.core.utils.YamlUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: 从配置的mysql数据源中获取表字段及表备注写入到全局上下文
 * @Version: 1.0
 */
public class JdbcPutContextHandler implements PutContextHandler {

    @Override
    public Map<String, Object> putData() {

        GenConfig genConfig = YamlUtils.loadYaml("genCode/gen.yml", GenConfig.class);
        String tableComment = JdbcUtil.getComment(genConfig.getJdbc(), genConfig.getJdbc().getTableName());
        List<TableInfo> fields = JdbcUtil.queryTableInfo(genConfig.getJdbc(), genConfig.getJdbc().getTableName());
        Map<String, Object> res = new HashMap<>();
        res.put("tableComment", tableComment);
        res.put("fields", fields);
        return res;

    }

}
