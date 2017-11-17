package com.eurekaConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by enHui.Chen on 2017/11/16 0016.
 */
@RestController
public class LoadBanlanceController {
    // 负载均衡客户端
    @Autowired
    LoadBalancerClient loadBalancerClient;

    // 发起请求的template
    @Autowired
    private RestTemplate template;

    @RequestMapping("/loadBanlance")
    public String loadBanlance(String name) {
        // 通过负载均衡客户端的choose()方法选择出一个可用的服务实例
        ServiceInstance serviceInstance = loadBalancerClient.choose("cloud-eureka-client");
        // 通过服务实例信息拼接url用于请求
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/test?name=" + name;
        // 通过restTemplate来发起请求
        return template.getForObject(url, String.class);
    }
}
