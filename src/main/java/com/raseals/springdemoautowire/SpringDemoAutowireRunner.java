package com.raseals.springdemoautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.raseals.springdemoautowire.service.MoneyService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SpringDemoAutowireRunner implements CommandLineRunner
{
    @Autowired
    private ConfigurableApplicationContext context;
    
    @Autowired
    private MoneyService moneyService;

    @Override
    public void run(String... args) throws Exception
    {
        String moneyServiceName = moneyService.getServiceName();
        
        log.info("Money Service Name: {}", moneyServiceName);
        
        // release Spring Context resources
//        context.close();
        
        // Close Application
//        System.exit(0);
    }

}
