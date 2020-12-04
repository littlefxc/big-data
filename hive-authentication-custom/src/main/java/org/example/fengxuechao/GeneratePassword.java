/*
 * 版权所有: 爱WiFi无线运营中心
 * 创建日期: 2020/12/4
 * 创建作者: 冯雪超
 * 文件名称: GeneratePassword.java
 * 版本: v1.0
 * 功能:
 * 修改记录：
 */
package org.example.fengxuechao;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author fengxuechao
 * @date 2020/12/4
 */
public class GeneratePassword {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("请输入密码！");
        }
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        String encodePassword = passwordEncoder.encode(args[0]);
        System.out.println("加密密码 : " + encodePassword);
    }
}