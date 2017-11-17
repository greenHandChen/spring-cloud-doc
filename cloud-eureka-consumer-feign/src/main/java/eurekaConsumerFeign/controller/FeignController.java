package eurekaConsumerFeign.controller;

import eurekaConsumerFeign.Feign.FeignDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by enHui.Chen on 2017/11/16 0016.
 */
@RestController
public class FeignController {

    @Autowired
    private FeignDemo feignDemo;

    @RequestMapping("/feignBanlance")
    public String feignBanlance(String name) {
        return feignDemo.feignConsumer(name);
    }
}
