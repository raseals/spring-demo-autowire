package com.raseals.springdemoautowire.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raseals.springdemoautowire.service.MoneyService;

@Service
@Profile("dollarService")
public class DollarServiceImpl implements MoneyService
{

    @Override
    public String getServiceName()
    {
        return "DollarService";
    }
    
}
