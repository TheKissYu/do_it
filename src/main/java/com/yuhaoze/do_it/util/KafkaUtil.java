package com.yuhaoze.do_it.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;



public class KafkaUtil {
    static {
        PropertiesUtil p = new PropertiesUtil();
    }

    public static String topic ;
    public static void setTopic(String topic){
        KafkaUtil.topic =topic;
    }
}
