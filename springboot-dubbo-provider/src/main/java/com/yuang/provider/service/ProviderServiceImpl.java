package com.yuang.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yuang.api.ProviderService;
import org.springframework.stereotype.Component;

/**
 * @author zhang
 */
@Component   // 可以不加
@Service(version = "1.0.0")
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
