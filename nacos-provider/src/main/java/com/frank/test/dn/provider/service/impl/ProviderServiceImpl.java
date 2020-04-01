package com.frank.test.dn.provider.service.impl;

import com.frank.test.dn.provider.service.ProviderService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @ProjectName: spring-boot-dubbo-nacos
 * @Package: com.frank.test.dn.provider.service.impl
 * @ClassName: ProviderServiceImpl
 * @Author: cy
 * @Description: ${description}
 * @Date: 2020-04-01 04:00
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    public String sayHello(String name) {
        return name;
    }
}
