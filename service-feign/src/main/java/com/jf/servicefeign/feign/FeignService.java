package com.jf.servicefeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("server-one")   //指定调用哪个服务
public interface FeignService {

    @RequestMapping(value = "/getString/{name}",method = RequestMethod.GET)
    String getUserAndPort(@PathVariable("name") String name);

}
