package com.fengxuechao.example.hive.aop;

import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 通过 BeanDefinitionRegistryPostProcessor 手动注册 bean 到Ioc 容器
 *
 * @author fengxuechao
 * @date 2020/6/23
 */
@EnableConfigurationProperties(LogProperties.class)
@ComponentScan
@Configuration
public class LogConfig {

    @Autowired
    private LogProperties logProperties;

    @Autowired
    private LogAspect logAspect;

    @Bean("logExpressionAdvisor")
    @ConditionalOnProperty("athena.common.log.aop.expression")
    public Advisor logExpressionAdvisor() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression(logProperties.getExpression());
        return new DefaultPointcutAdvisor(pointcut, logAspect);
    }
}
