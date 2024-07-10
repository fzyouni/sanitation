package com.iben.sanitation.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * kafka 数据读取器
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/07 16:57
 */
@Component
public class KafkaDataConsumer {

    @KafkaListener(topics = "test", groupId = "group_id_street_sweeper_dev")
    public void consume(String message) {
        System.out.println(message);
    }

}
