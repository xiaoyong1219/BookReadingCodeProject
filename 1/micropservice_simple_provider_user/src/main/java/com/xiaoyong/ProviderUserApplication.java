package com.xiaoyong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Create By dongxiaoyong on /2021/3/5
 * description: 启动类
 *
 * @author dongxiaoyong
 */
@EnableJpaRepositories(basePackages={"com.xiaoyong.dao"})
@EntityScan("com.xiaoyong.entity")
@SpringBootApplication
public class ProviderUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class,args);
    }

}
