package com.saeed.waa.services.impl;

import com.saeed.waa.entities.Logger;
import com.saeed.waa.repos.LoggerRepo;
import com.saeed.waa.services.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerServiceImpl implements LoggerService {
    @Autowired
    private LoggerRepo loggerRepo;

    @Override
    public void log(String operation) {
        this.loggerRepo.save(new Logger(operation));
    }
}
