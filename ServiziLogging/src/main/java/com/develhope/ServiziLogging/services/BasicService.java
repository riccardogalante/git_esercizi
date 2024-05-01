package com.develhope.ServiziLogging.services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;


@Service
public class BasicService {
    private Logger logger = LoggerFactory.getLogger(BasicService.class);

    @Value("${var1}")
    private int var1;

    @Value("${var2}")
    private int var2;

    public Double exp() {
        logger.debug("Calculating power of {} and {}", var1, var2);
        double result = Math.pow(var1, var2);
        logger.debug("Result: {}", result);
        return result;
    }


}
