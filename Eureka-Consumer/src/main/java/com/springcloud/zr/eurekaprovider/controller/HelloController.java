package com.springcloud.zr.eurekaprovider.controller;

import com.springcloud.zr.eurekaprovider.service.ProviderApi;
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
    @Autowired
    ProviderApi providerApi;

    @Value("${server.port}")
    String port;

    @GetMapping("/getHi")
    public String hi() {
        String providerHi = providerApi.getHi();
        return "hi, consumer port: " + port + "; " + providerHi;
    }

    @GetMapping("/client1")
    public String getServices() {
        List<String> services = client.getServices();

        for (String service : services) {
            System.out.println(service);
        }

        return "success";
    }
}
