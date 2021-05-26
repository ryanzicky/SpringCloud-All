package com.springcloud.zr.eurekaprovider.controller;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

/**
 * @Author zhourui
 * @Date 2021/5/24 14:32
 */
public class HealthStatusService implements HealthIndicator {

    @Override
    public Health health() {
        return null;
    }
}
