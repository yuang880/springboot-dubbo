package com.yuang.provider;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhang
 */
@SpringBootApplication
@EnableDubbo
public class ProviderStarter {
    public static void main(String[] args) {
        SpringApplication.run(ProviderStarter.class, args);
    }
}
