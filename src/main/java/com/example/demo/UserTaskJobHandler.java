package com.example.demo;

import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.client.api.worker.JobHandler;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class UserTaskJobHandler implements JobHandler {

    @Autowired
    private ZeebeClient zeebeClient;


    @Override
    @JobWorker(timeout = 2592000000L, autoComplete = false)
    public void handle(JobClient client, ActivatedJob job) {
        log.info("------------------------>{}", job.getKey());
    }
}
