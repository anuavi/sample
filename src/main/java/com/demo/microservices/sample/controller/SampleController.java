package com.demo.microservices.sample.controller;

import java.util.List;

import com.demo.microservices.sample.entity.SampleEntity;
import com.demo.microservices.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping(value = "/sample")
    public List<SampleEntity> sample() {
        return sampleService.getAll();
    }
}