package com.studyclub.core.core.impl;

import com.studyclub.core.config.GenConfig;
import com.studyclub.core.config.MapperConfig;
import com.studyclub.core.core.sdk.PostCurFiledContextAware;
import com.studyclub.core.entity.TableInfo;
import com.studyclub.core.utils.TableUtils;
import org.apache.velocity.VelocityContext;

import java.util.List;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: 从字段注解中获取数据
 * @Version: 1.0
 */
public class ClassPutContextHandler implements PostCurFiledContextAware {

    private Class<?> clazz;

    public ClassPutContextHandler(Class<?> clazz) {
        this.clazz = clazz;
    }

    @Override
    public void doAware(GenConfig genConfig, MapperConfig mapperConfig, VelocityContext context) {

        String tableComment = TableUtils.getComment(clazz);
        List<TableInfo> fields = TableUtils.build(clazz);
        context.put("tableComment", tableComment);
        context.put("fields", fields);

    }

}
