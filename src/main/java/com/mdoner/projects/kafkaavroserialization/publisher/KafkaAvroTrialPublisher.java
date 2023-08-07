package com.mdoner.projects.kafkaavroserialization.publisher;

import com.mdoner.projects.kafkaavroserialization.avro.KafkaTrialAvroModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaAvroTrialPublisher {
    private final KafkaTemplate<String, KafkaTrialAvroModel> kafkaTemplate;

    private final String topicName;

    public KafkaAvroTrialPublisher(KafkaTemplate<String, KafkaTrialAvroModel> kafkaTemplate
            , @Value("${kafka.topic.name}") String topicName) {
        this.kafkaTemplate = kafkaTemplate;
        this.topicName = topicName;
    }

    public void publish(KafkaTrialAvroModel avroModel) {
        System.out.println("Sending avro...");
        kafkaTemplate.send(topicName, avroModel);
        System.out.println("Avro sent:" + avroModel.getId());
    }


}
