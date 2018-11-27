package com.raseals.springdemoautowire.service;

import org.springframework.stereotype.Service;

@Service("francService")
public class FrancService implements MoneyService
{

    @Override
    public String getServiceName()
    {
        return "FrancService";
    }

}
