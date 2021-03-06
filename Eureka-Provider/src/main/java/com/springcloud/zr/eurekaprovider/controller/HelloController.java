package com.springcloud.zr.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author zhourui
 * @Date 2021/5/24 10:43
 */
@RestController
public class HelloController {

    @Autowired
    DiscoveryClient client;

    @Value("${server.port}")
    String port;

    @GetMapping("/getHi")
    public String hi() {
        return "hi, provider port: " + port;
    }

    @GetMapping("/client1")
    public void getServices() {
        List<String> services = client.getServices();
    }
}
