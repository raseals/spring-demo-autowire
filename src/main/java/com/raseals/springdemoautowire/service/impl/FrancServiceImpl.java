package com.raseals.springdemoautowire.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raseals.springdemoautowire.service.MoneyService;

@Service
@Profile("francService")
public class FrancServiceImpl implements MoneyService
{

    @Override
    public String getServiceName()
    {
        return "FrancService";
    }

}
