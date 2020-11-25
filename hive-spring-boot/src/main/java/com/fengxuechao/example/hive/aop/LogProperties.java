package com.fengxuechao.example.hive.aop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author fengxuechao
 * @date 2020/6/23
 */
@Data
@ConfigurationProperties(prefix = "aop.log")
public class LogProperties {

    /**
     * aop 切点表达式
     */
    private String expression;
}
