package com.frank.nacos.common.pk.service;

import java.util.HashMap;

/**
 *
 *
 * @author cy
 * @version SmsService.java, v 0.1 2020年09月15日 22:09 cy Exp $
 */
public interface SmsService {

    /**
     * 发送短信服务
     * @param phone 手机号
     * @param templateId 模版ID
     * @param content 消息内容
     * @param parameters 基于短信模版发送的信息时的参数集合
     * @return
     */
    String sendSms(String phone, String templateId, String content, HashMap parameters);

}
