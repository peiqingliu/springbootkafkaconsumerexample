package com.liupeiqing.kafka.consumer.listen;

import com.liupeiqing.kafka.consumer.module.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author liupeqing
 * @date 2019/2/22 10:54
 */
@Service
public class KafkaConsumer {

    /**
     * 消费string
     * @param message
     */
    @KafkaListener(topics = "Kafka_Example",group = "group_id")
    public void consumer(String message){
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(topics = "Kafka_Example",group = "group_id")
    public void consumer2(String message){
        System.out.println("Consumed message: " + message);
    }

    /**
     * 消费bean  json格式
     * @param user
     */
    @KafkaListener(topics = "Kafka_Example_json",group = "group_json",containerFactory = "userKafkaListenerFactory")
    public void consumenJson(User user){
        System.out.println("Consumed JSON Message: " + user);
    }
}
