package com.eurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by enHui.Chen on 2017/11/16 0016.
 */
@SpringBootApplication
// 开启服务发现客户端功能
@EnableDiscoveryClient
public class CloudEurekaClient {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaClient.class, args);
    }
}
