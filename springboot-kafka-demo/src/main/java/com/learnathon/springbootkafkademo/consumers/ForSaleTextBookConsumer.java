package com.learnathon.springbootkafkademo.consumers;

import java.io.IOException;

import com.learnathon.springbootkafkademo.entities.NewForSaleTextBookEvent;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ForSaleTextBookConsumer {

  @KafkaListener(topics = "demo_david", groupId = "demo_david")
  public void receiveForSaleTextBookEvent(
      ConsumerRecord<String, NewForSaleTextBookEvent> msg
    )
      throws IOException {
      NewForSaleTextBookEvent eventMessage = msg.value();
      System.out.println(
        "Got my message! Book Name: " + eventMessage.getBookName()
      );
      System.out.println(
        "Got my message! Book Price: " + eventMessage.getPrice()
      );
    }
}
