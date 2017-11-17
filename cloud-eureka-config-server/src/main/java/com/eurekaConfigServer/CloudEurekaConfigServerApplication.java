package com.eurekaConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by enHui.Chen on 2017/11/17 0017.
 */
@SpringBootApplication
@EnableConfigServer
public class CloudEurekaConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaConfigServerApplication.class, args);
    }
}
