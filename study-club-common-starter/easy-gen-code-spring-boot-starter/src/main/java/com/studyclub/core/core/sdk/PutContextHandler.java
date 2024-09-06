package com.studyclub.core.core.sdk;

import com.studyclub.core.entity.Context;
import com.studyclub.core.utils.ConfigUtils;

import java.util.Map;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: 从类中写入数据到全局上下文
 * @Version: 1.0
 */
public interface PutContextHandler {

    Map<String, Object> putData();

    default boolean put() {

        boolean res = false;
        Map<String, Object> map = putData();
        Context context = ConfigUtils.getContext();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            context.put(entry.getKey(), entry.getValue());
            res = true;
        }
        return res;

    }

}
