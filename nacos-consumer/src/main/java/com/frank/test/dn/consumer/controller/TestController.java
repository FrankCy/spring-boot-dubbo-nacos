package com.frank.test.dn.consumer.controller;

import com.frank.test.dn.provider.service.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: spring-boot-dubbo-nacos
 * @Package: com.frank.test.dn.consumer.controller
 * @ClassName: TestController
 * @Author: cy
 * @Description: ${description}
 * @Date: 2020-04-01 04:26
 */
@RestController
public class TestController {

    @Reference
    ProviderService providerService;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello(){
        return providerService.sayHello("Hello Dubbo Nacos!");
    }

}
