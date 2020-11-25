package com.fengxuechao.example.hive;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 这是一个 Hive 结合 Spring Jdbc 的示例程序
 *
 * @author fengxuechao
 * @date 2020/10/14
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan("com.fengxuechao.example.hive.dao")
public class HiveSpringApp {

    public static void main(String[] args) {
        SpringApplication.run(HiveSpringApp.class, args);
    }

    @Autowired
    private ServerProperties serverProperties;

    /**
     * 配置swagger2核心配置 docket
     * 路径1：http://localhost:8080/swagger-ui.html
     * 路径2：http://localhost:8080/doc.html
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 指定controller包
                .apis(RequestHandlerSelectors.basePackage("com.fengxuechao.example.hive.controller"))
                .build();
    }

    private ApiInfo apiInfo() {
        String url = "http://127.0.0.1:" + serverProperties.getPort();
        return new ApiInfoBuilder()
                .title("Hive Java Demo")
                .version("1.0.0")
                .termsOfServiceUrl(url)
                .build();
    }

}
