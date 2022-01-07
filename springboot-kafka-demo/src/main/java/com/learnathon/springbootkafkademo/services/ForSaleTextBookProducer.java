package com.learnathon.springbootkafkademo.services;

import com.learnathon.springbootkafkademo.entities.NewForSaleTextBookEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ForSaleTextBookProducer {
  @Autowired
  private KafkaTemplate<String, NewForSaleTextBookEvent> kafkaTemplate;

  public void sendMessage(String message) {
    NewForSaleTextBookEvent newEvent =
        new NewForSaleTextBookEvent(message, 25.00);
    this.kafkaTemplate.send("demo_david", message, newEvent);
  }

}
