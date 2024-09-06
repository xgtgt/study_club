package com.studyclub.core.core.sdk;

import cn.hutool.core.map.MapUtil;
import org.apache.velocity.VelocityContext;

import java.util.Map;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: 针对某个生成文件写入独有上下文
 * @Version: 1.0
 */
public interface FilePutContextHandler {

    /**
     * 将map中的键值对写入当前文件的上下文
     *
     * @param fileId 文件id
     * @return 写入的数据
     */
    Map<String, Object> putData(String fileId);

    default void put(VelocityContext context, String fileId) {

        Map<String, Object> map = putData(fileId);
        if (MapUtil.isNotEmpty(map)) {
            for (Map.Entry<String, Object> entity : map.entrySet()) {
                context.put(entity.getKey(), entity.getValue());
            }

        }

    }

}
