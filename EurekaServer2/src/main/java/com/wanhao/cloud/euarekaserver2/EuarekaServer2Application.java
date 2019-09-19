package com.wanhao.cloud.euarekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EuarekaServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(EuarekaServer2Application.class, args);
    }

}
