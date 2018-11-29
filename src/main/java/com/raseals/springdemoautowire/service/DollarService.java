package com.raseals.springdemoautowire.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dollarService")
public class DollarService implements MoneyService
{

    @Override
    public String getServiceName()
    {
        return "DollarService";
    }
    
}
