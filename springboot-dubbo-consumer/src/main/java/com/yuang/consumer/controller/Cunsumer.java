package com.yuang.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yuang.api.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang
 */
@RestController
public class Cunsumer {

    @Reference(version = "1.0.0")
    public ProviderService providerService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return providerService.sayHello(name);
    }
}
