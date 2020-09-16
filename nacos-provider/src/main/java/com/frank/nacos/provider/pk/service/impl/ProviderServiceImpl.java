package com.frank.nacos.provider.pk.service.impl;

import com.frank.nacos.common.pk.service.ProviderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 *
 *
 * @author cy
 * @version ProviderServiceImpl.java, v 0.1 2020年09月16日 15:00 cy Exp $
 */
@Slf4j
@Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String sayHello(String name) {
        return "success{"+name+"}";
    }
}
