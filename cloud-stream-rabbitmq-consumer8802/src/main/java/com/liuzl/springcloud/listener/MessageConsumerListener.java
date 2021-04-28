package com.liuzl.springcloud.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MessageConsumerListener
 * @Description: 消息消费监听器
 * @Author: 52945
 * @Date: 2020/5/26 16:46
 * @Version: 1.0
 */
@Component
@Slf4j
@EnableBinding(Sink.class)  /*开启绑定，表示当前类为Sink, 负责接收channel发送过来的消息进行消费*/
public class MessageConsumerListener {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)   /*表示监听sink的input，input在配置文件中配置了，绑定了指定的exchange上获取数据*/
    public void input(Message<String> message){
        log.info("消费者" + serverPort + "---->接收到的消息：" + message.getPayload());
    }

}
