package com.mdoner.projects.kafkaavroserialization.listener;


import com.mdoner.projects.kafkaavroserialization.avro.KafkaTrialAvroModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaAvroTrialListener {
    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(KafkaTrialAvroModel avroModel) {
        System.out.println("Received KafkaTrialAvroModel id: " + avroModel.getId());
        System.out.println("Received Message: " + avroModel.getMessage());
    }

}
