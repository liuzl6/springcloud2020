package com.liuzl.springcloud.service.impl;

import com.liuzl.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName: MessageProviderImpl
 * @Description: 消息生产者实现类
 * @Author: 52945
 * @Date: 2020/5/26 16:26
 * @Version: 1.0
 */
@EnableBinding(Source.class)  /*开启绑定，表示当前类为Source, 负责生产消息，并且发送给channel*/
@Slf4j
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;

    /*发送消息*/
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("*******serial：" + serial);
        return null;
    }

}
