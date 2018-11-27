package com.raseals.springdemoautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raseals.springdemoautowire.service.MoneyService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SpringDemoAutowireRunner implements CommandLineRunner
{
    
    @Autowired
    @Qualifier("#{${money.service.name}}")
    private MoneyService moneyService;

    @Override
    public void run(String... args) throws Exception
    {
        String moneyServiceName = moneyService.getServiceName();
        
        log.info("Money Service Name: {}", moneyServiceName);
    }

}
