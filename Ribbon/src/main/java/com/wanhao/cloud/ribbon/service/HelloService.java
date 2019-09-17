package com.wanhao.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by LiuLiHao on 2019/9/17 0017 下午 04:31
 * @author : LiuLiHao
 * 描述：
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate template;

    @HystrixCommand(fallbackMethod = "error")
    public String sayHi(String name){
        return template.getForObject("http://service-hi/hi?name="+name,String.class);
    }

    /**
     * 熔断的方法
     * @param name
     * @return
     */
    public String error(String name){
        return "调用失败! "+name;
    }
}
