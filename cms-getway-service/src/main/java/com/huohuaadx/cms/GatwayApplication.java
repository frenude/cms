package com.huohuaadx.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 08 02,2021
 * @desc: //todo
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class GatwayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatwayApplication.class, args);
    }
}
