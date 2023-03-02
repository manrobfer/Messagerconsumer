package br.com.consumer.consumer.listeners;

import br.com.consumer.consumer.custom.CustomListener;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ConsumerListener {

    @KafkaListener(groupId = "group-1", topicPartitions = { @TopicPartition(topic = "first-topic", partitions = {"1"} )}, containerFactory = "concurrentKafkaListenerContainerFactory")
    public void listener(String message){
       log.info(" Listener 1 :::   Message Returned {}", message);
    }

    @KafkaListener(groupId = "group-2", topics = "first-topic", containerFactory = "validationContainerFactory")
    public void listener2(String message){
        log.info("Linener 2 ::: Message Returned {}", message);
    }

    @SneakyThrows
    @CustomListener(groupId = "group-1")
    public void listener3(String message){
        log.info("Listener 2 ::: Message Returned {}", message);
        throw new IllegalArgumentException("BAD EXCEPTION ::: ...");
    }


}
