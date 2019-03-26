package com.github.zk.springcloudstreamconsumer2.service.impl;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author zk
 * @date 2019/3/7 17:53
 */
@EnableBinding(Sink.class)
public class ReceiveService {

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        System.out.println(payload);
    }
}
