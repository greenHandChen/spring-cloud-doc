package eurekaConsumerFeign.Feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by enHui.Chen on 2017/11/16 0016.
 */
@FeignClient("cloud-eureka-client")
public interface FeignDemo {

    @RequestMapping("/test")
    @ResponseBody
    String feignConsumer(@RequestParam(value = "name") String name);
}
