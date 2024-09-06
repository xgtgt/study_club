package com.studyclub.core.utils;

import com.studyclub.core.entity.Context;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: 获取全局上下文的配置工具
 * @Version: 1.0
 */
public class ConfigUtils {

    private static Context ctx = new Context();

    public static Context getContext() {
        return ctx;
    }

    public static void reSetContext(Context context) {
        ctx = context;
    }

}
