package com.studyclub.subject.infra.basic.utils;

import com.alibaba.druid.filter.config.ConfigTools;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/**
 * @Author: xgt
 * @CreateTime: 2024-08-09
 * @Description: 数据库加密util
 * @Version: 1.0
 */
public class DruidEncryptUtil {

    private static String publicKey;

    private static String privateKey;

    static{
        try {
            String[] keyPair = ConfigTools.genKeyPair(512);
            privateKey = keyPair[0];
            System.out.println("privateKey:"+privateKey);
            publicKey = keyPair[1];
            System.out.println("publicKey:"+publicKey);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
    }

    /**
     * 加密
     * @param plainText
     * @return
     * @throws Exception
     */
    public static String encrypt(String plainText) throws Exception{
        String encrypt = ConfigTools.encrypt(privateKey, plainText);
        System.out.println("encrypt:"+encrypt);
        return encrypt;
    }

    /**
     * 解密
     * @param encryptText
     * @return
     * @throws Exception
     */
    public static String decrypt(String encryptText) throws Exception{
        String decrypt = ConfigTools.decrypt(publicKey, encryptText);
        System.out.println("decrypt:"+decrypt);
        return decrypt;
    }

    public static void main(String[] args) throws Exception {
        String encrypt = encrypt("Wing1Q2W#E");
        System.out.println("encrypt:" + encrypt);
    }
}
