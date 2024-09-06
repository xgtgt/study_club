package com.studyclub.core.utils;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: 判断是否是基本类型工具类
 * @Version: 1.0
 */
public class PrimitiveTypeUtils {

    public static boolean isPrimitive(Object obj) {
        return obj instanceof Integer ||
                obj instanceof Long ||
                obj instanceof Float ||
                obj instanceof Double ||
                obj instanceof Boolean ||
                obj instanceof Character ||
                obj instanceof Byte;
    }

}
