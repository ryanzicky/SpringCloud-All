package com.springcloud.zr.eurekaprovider.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

/**
 * @Author zhourui
 * @Date 2021/5/26 18:08
 */
@Service
@FeignClient(name = "provider")
public interface ProviderApi {

    @GetMapping("/getHi")
    String getHi();
}
