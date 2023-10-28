package net.ekene.ums_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UmsApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(UmsApiGatewayApplication.class, args);
    }

}
