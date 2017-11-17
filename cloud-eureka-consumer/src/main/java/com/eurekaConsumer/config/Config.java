package com.eurekaConsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by enHui.Chen on 2017/11/16 0016.
 */
@Configuration
public class Config {
    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
