package br.com.consumer.consumer.custom;

import org.springframework.core.annotation.AliasFor;
import org.springframework.kafka.annotation.KafkaListener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)//Reflexao
@KafkaListener
public @interface CustomListener {

    @AliasFor(annotation = KafkaListener.class, attribute = "topics")
    String[] topics()  default "first-topic";

    @AliasFor(annotation = KafkaListener.class, attribute = "containerFactory")
    String containerFactory() default "concurrentKafkaListenerContainerFactory";

    @AliasFor(annotation = KafkaListener.class, attribute = "groupId")
    String groupId() default "";

    @AliasFor(annotation = KafkaListener.class, attribute =  "errorHandler")
    String errorHandler() default "consumerErrorHandler" ;

}
