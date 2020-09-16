package com.frank.nacos.provider.pk;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 *
 *
 * @author cy
 * @version NacosProviderApplication.java, v 0.1 2020年09月15日 19:35 cy Exp $
 */
@SpringBootApplication
// 开启Dubbo服务的注解
@EnableDubbo
public class NacosProviderApplication {

    /**
     * 使用jar方式打包的启动方式
     */
    private static CountDownLatch COUNT_DOWN_LATCH = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(NacosProviderApplication.class, args).registerShutdownHook();
        COUNT_DOWN_LATCH.await();
    }

}
