package com.learnathon.springbootkafkademo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ForSaleTextBookProducer {
  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  public void sendMessage(String message) {
    this.kafkaTemplate.send("demo_david", message, message);
  }

}
