package com.cts.userRegestration.Services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private Logger logger= LoggerFactory.getLogger(KafkaProducer.class);

    public void sendUserCredentialsToKafka(String username, String password) {
        String message = username + ":" + password;
        this.logger.info("User registered");
        kafkaTemplate.send("user-credentials-topic", message);
    }
}