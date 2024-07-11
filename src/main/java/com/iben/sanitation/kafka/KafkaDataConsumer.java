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

    //todo 这里是一条条获取 kafka 里面的数据，所以就可能出现这一条数据是任务A的进度，下一条数据是任务B的
    //所以这儿首先得从数据库里面拿到所有的作业信息，作业信息里面有车辆信息，这样处理每一条数据信息的时候，就是相当于处理任务的进度；
    //可能会导致内存占用率高
    //另外这儿的数据更新频率极快，所以不能直接讲计算的数据直接更新到数据库，
    //以防止数据库扛不住，先存到buffer 里面，然后通过定时任务刷新到数据库

    //实现思路
    // 1.spring 启动的时候，需要获取作业和车辆信息，并且缓存到 Map 里面 key 是 workId+车辆ID;value 是 作业详情
    // Kafka 数据过来的时候，首先需要拿到 车辆ID 然后 模糊匹配 map 里面的 key
    // 如果都不匹配，则视为脏数据直接抛弃
    // 找到匹配的数据信息，则开始生成任务处理进度记录，然后对比最终的 buffer，最终更新到数据库


  }

}
