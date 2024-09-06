package com.studyclub.core.core.sdk;

import com.studyclub.core.config.GenConfig;
import com.studyclub.core.config.MapperConfig;
import org.apache.velocity.VelocityContext;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: 针对当前文件的上下文进行操作
 * @Version: 1.0
 */
@FunctionalInterface
public interface PostCurFiledContextAware {

    void doAware(GenConfig genConfig, MapperConfig mapperConfig, VelocityContext context);

}
