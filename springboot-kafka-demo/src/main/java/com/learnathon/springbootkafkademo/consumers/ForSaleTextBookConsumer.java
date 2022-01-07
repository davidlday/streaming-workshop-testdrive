package com.learnathon.springbootkafkademo.consumers;

import java.io.IOException;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ForSaleTextBookConsumer {

  @KafkaListener(topics = "demo_david", groupId = "demo_david")
  public void receiveForSaleTextBookEvent(
      ConsumerRecord<String, String> msg
    )
    throws IOException {
      System.out.println("Got my message! : " + msg.value());
    }
}
