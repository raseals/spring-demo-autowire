package com.raseals.springdemoautowire.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("francService")
public class FrancService implements MoneyService
{

    @Override
    public String getServiceName()
    {
        return "FrancService";
    }

}
