package com.studyclub.core.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.studyclub.core.core.CodeGenerationCode;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


/**
 * @Author: xgt
 * @CreateTime: 2024-09-05
 * @Description: yml 转对象工具类
 * @Version: 1.0
 */
public class YamlUtils {
    private static final ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

    public static <T> T loadYaml(String filePath, Class<T> valueType) {
        try {
            ClassLoader classLoader = CodeGenerationCode.class.getClassLoader();
            URL resource = classLoader.getResource(filePath);
            InputStream inputStream = resource.openStream();
            return objectMapper.readValue(inputStream, valueType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
