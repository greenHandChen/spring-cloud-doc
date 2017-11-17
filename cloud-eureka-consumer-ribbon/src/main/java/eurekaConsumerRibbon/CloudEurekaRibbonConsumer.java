package eurekaConsumerRibbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by enHui.Chen on 2017/11/16 0016.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudEurekaRibbonConsumer {
    public static void main(String[] args){
        SpringApplication.run(CloudEurekaRibbonConsumer.class,args);
    }
}
