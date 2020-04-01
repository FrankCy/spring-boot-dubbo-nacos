package com.frank.test.dn.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * @ProjectName: spring-boot-dubbo-nacos
 * @Package: com.frank.test.dn.provider
 * @ClassName: NacosProviderApplication
 * @Author: cy
 * @Description: ${description}
 * @Date: 2020-03-31 19:34
 */
@SpringBootApplication
@EnableDubbo
public class NacosProviderApplication {

    /**
     * 使用jar方式打包的启动方式
     */
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException{
        SpringApplication.run(NacosProviderApplication.class, args).registerShutdownHook();
        countDownLatch.await();
    }
}
