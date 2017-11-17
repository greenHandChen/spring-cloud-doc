package eurekaConsumerFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by enHui.Chen on 2017/11/16 0016.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudEurekaConsumerFeign {
    public static void main(String[] args){
        SpringApplication.run(CloudEurekaConsumerFeign.class,args);
    }
}
