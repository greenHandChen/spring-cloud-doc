package eurekaConsumerRibbon.controller;

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
public class RibbonController {
    // 带有负载均衡的template
    @Autowired
    private RestTemplate template;

    @RequestMapping("/loadBanlance")
    public String loadBanlance(String name) {
        return template.getForObject("http://cloud-eureka-client/test?name=" + name, String.class);
    }
}
