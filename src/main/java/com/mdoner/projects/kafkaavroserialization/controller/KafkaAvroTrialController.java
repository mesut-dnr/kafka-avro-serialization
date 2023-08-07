package com.mdoner.projects.kafkaavroserialization.controller;

import com.mdoner.projects.kafkaavroserialization.rest.req.KafkaAvroTrialReq;
import com.mdoner.projects.kafkaavroserialization.service.KafkaAvroTrialService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class KafkaAvroTrialController {

    private final KafkaAvroTrialService service;

    @GetMapping("test")
    ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World!");
    }

    @PostMapping
    ResponseEntity<String> publish(@RequestBody KafkaAvroTrialReq req) {
        String result = service.publish(req);
        return ResponseEntity.ok(result);
    }


}
