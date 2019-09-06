package com.demo.microservices.sample.service;

import java.util.List;

import com.demo.microservices.sample.entity.SampleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SampleService {

    @Autowired
    com.demo.microservices.sample.Repository.SampleRepository sampleRepo;

    public List<SampleEntity> getAll() {
        return sampleRepo.getAll();
    }
}