package com.studyclub.subject.common.enums;

import lombok.Getter;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-10
 * @Description: 结果枚举
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(200,"成功"),
    FAIL(500,"失败");

    public int code;

    public String desc;

    ResultCodeEnum(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static ResultCodeEnum getByCode(int codeVal){
        for(ResultCodeEnum resultCodeEnum : ResultCodeEnum.values()){
            if(resultCodeEnum.code == codeVal){
                return resultCodeEnum;
            }
        }
        return null;
    }

}
