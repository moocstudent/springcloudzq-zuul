package com.ykmimi.zuulmodule;

import com.ykmimi.utilsboot.utils.PortUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ZuulModuleApplication {

    public static void main(String[] args) {
        int port = PortUtil.setPort(0, "默认端口使用8040", 8040);
        new SpringApplicationBuilder(ZuulModuleApplication.class).properties("server.port="+port).run(args);
    }

}
