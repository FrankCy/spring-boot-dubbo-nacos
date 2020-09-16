package com.frank.nacos.consumer.pk.controller;

import com.frank.nacos.common.pk.service.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author cy
 * @version HelloController.java, v 0.1 2020年09月15日 20:16 cy Exp $
 */
@RestController
public class HelloController {

    @Reference
    private ProviderService providerService;

    @RequestMapping(name = "/sayHello", method = RequestMethod.GET)
    public String sayHello(){
        return providerService.sayHello("Hello Dubbo Nacos!");
    }
}
