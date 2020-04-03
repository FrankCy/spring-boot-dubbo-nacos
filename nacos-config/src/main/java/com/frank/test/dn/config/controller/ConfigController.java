package com.frank.test.dn.config.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: spring-boot-dubbo-nacos
 * @Package: com.frank.test.dn.config.controller
 * @ClassName: ConfigController
 * @Author: cy
 * @Description: ${description}
 * @Date: 2020-04-03 16:48
 */
@RestController
public class ConfigController {

    @NacosValue(value = "${test.yml.value:null}", autoRefreshed = true)
    private String nacosValue;

    @RequestMapping(value = "/configTest", method = RequestMethod.GET)
    public String configTest(){
        return "Nacos Config Test ----- " + nacosValue;
    }

}
