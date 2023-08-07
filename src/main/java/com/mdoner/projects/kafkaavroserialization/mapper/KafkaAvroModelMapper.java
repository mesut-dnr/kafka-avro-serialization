package com.mdoner.projects.kafkaavroserialization.mapper;

import com.mdoner.projects.kafkaavroserialization.avro.KafkaTrialAvroModel;
import com.mdoner.projects.kafkaavroserialization.rest.req.KafkaAvroTrialReq;
import org.springframework.stereotype.Component;

@Component
public class KafkaAvroModelMapper {
    public KafkaTrialAvroModel reqToAvroModel(KafkaAvroTrialReq req) {
        return KafkaTrialAvroModel.newBuilder()
                .setId(req.getId())
                .setMessage(req.getMessage())
                .build();

    }
}
