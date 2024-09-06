package com.studyclub.core.utils;

import com.alibaba.fastjson.JSONObject;
import com.studyclub.core.entity.Context;

import java.util.Map;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: 使用json构建上下文的上下文工具
 * @Version: 1.0
 */
public class ContextUtils {

    public static Context buildContext(String json) {

        Context context = new Context();
        JSONObject jsonObject = JSONObject.parseObject(json);
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            context.put(entry.getKey(), entry.getValue());
        }
        return context;

    }

}
