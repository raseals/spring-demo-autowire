package com.raseals.springdemoautowire.service;

import org.springframework.stereotype.Service;

@Service("dollarService")
public class DollarService implements MoneyService
{

    @Override
    public String getServiceName()
    {
        return "DollarService";
    }
    
}
