package com.cloudConfigClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by enHui.Chen on 2017/11/17 0017.
 */
@RestController
public class ConfifClientController {
    @Value("${info.profile}")
    private String justForTest;

    @RequestMapping("/justForTest")
    public String getJustForTest() {
        return justForTest;
    }
}
