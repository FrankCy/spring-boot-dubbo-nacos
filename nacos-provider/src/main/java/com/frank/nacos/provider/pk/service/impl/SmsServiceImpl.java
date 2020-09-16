package com.frank.nacos.provider.pk.service.impl;

import com.frank.nacos.common.pk.service.SmsService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

import java.util.HashMap;

/**
 *
 *
 * @author cy
 * @version SmsServiceImpl.java, v 0.1 2020年09月16日 09:58 cy Exp $
 */
@Slf4j
@Service
public class SmsServiceImpl implements SmsService {

    @Override
    public String sendSms(String phone, String templateId, String content, HashMap parameters) {
        return null;
    }

}
