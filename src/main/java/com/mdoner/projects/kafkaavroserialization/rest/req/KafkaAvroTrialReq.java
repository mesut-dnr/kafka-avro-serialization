package com.mdoner.projects.kafkaavroserialization.rest.req;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KafkaAvroTrialReq {

    private String id;

    private String message;

}
