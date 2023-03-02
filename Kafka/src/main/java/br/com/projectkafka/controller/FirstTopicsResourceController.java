package br.com.projectkafka.controller;

import br.com.projectkafka.service.FirstTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/")
public class FirstTopicsResourceController {

    @Autowired
    private FirstTopicService firstTopicService;

    @PostMapping
    public ResponseEntity<?> sendFirstTopicMessage(@RequestBody String message){
        firstTopicService.sendFirstTopicMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }



}
