package com.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by enHui.Chen on 2017/11/16 0016.
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServerApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServerApplicaiton.class, args);
    }
}
