package com.wanhao.cloud.ribbon.controller;

import com.wanhao.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiuLiHao on 2019/9/17 0017 下午 04:35
 * @author : LiuLiHao
 * 描述：
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.sayHi(name);
    }

}
