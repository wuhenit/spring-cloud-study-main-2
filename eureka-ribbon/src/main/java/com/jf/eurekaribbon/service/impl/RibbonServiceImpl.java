package com.jf.eurekaribbon.service.impl;

import com.jf.eurekaribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String getStrings(String name) {

        return restTemplate.getForObject("http://SERVER-ONE/getString/"+name,String.class);
    }
}
