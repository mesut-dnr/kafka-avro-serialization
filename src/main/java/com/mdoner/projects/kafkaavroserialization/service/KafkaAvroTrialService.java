package com.mdoner.projects.kafkaavroserialization.service;


import com.mdoner.projects.kafkaavroserialization.avro.KafkaTrialAvroModel;
import com.mdoner.projects.kafkaavroserialization.mapper.KafkaAvroModelMapper;
import com.mdoner.projects.kafkaavroserialization.publisher.KafkaAvroTrialPublisher;
import com.mdoner.projects.kafkaavroserialization.rest.req.KafkaAvroTrialReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaAvroTrialService {

    private final KafkaAvroTrialPublisher kafkaAvroTrialPublisher;

    private final KafkaAvroModelMapper kafkaAvroModelMapper;

    public String publish(KafkaAvroTrialReq req){

        KafkaTrialAvroModel avroModel = kafkaAvroModelMapper.reqToAvroModel(req);

        kafkaAvroTrialPublisher.publish(avroModel);

        return avroModel.getId()+":published";

    }

}
