package br.com.projectkafka.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class FirstTopicService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendFirstTopicMessage(String message){
        kafkaTemplate.send("first-topic", message).addCallback(
                success -> log.info(" {} sent with sucess to partition: ( {} ) and offset ( {} )",
                                            message,success.getRecordMetadata().partition(),
                                            success.getRecordMetadata().offset() ),
                error -> log.info(" Error trying to send ")
        );

    }
}
