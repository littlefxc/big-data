/*
 * 版权所有: 爱WiFi无线运营中心
 * 创建日期: 2020/12/2
 * 创建作者: 冯雪超
 * 文件名称: CustomHiveServer2Authencation.java
 * 版本: v1.0
 * 功能:
 * 修改记录：
 */
package org.example.fengxuechao;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.hive.service.auth.PasswdAuthenticationProvider;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.security.sasl.AuthenticationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hive Server2 custom 安全认证模式
 * 需要将用户名和密码保存在
 *
 * @author fengxuechao
 * @date 2020/12/2
 */
public class CustomHiveServer2Authencation implements PasswdAuthenticationProvider {

    private final PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Override
    public void Authenticate(String username, String password)
            throws AuthenticationException {
        boolean authentication = false;
        HiveConf hiveConf = new HiveConf();
        Configuration conf = new Configuration(hiveConf);
        String filePath = conf.get("hive.server2.custom.authentication.file");
        System.out.println("hive.server2.custom.authentication.file [" + filePath + "] ..");
        File file = new File(filePath);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                String[] users = tempString.split(",", -1);
                if (users.length != 2) {
                    continue;
                }
                //authentication
                if (users[0].equals(username) && passwordEncoder.matches(password, users[1])) {
                    authentication = true;
                    break;
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new AuthenticationException("read auth config file error, [" + filePath + "] ..", e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        if (authentication) {
            System.out.println("user [" + username + "] auth check authentication .. ");
        } else {
            System.out.println("user [" + username + "] auth check fail .. ");
            throw new AuthenticationException("user [" + username + "] auth check fail .. ");
        }
    }
}
