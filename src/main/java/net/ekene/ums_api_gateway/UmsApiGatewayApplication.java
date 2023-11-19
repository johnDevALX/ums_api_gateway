package net.ekene.ums_api_gateway;

import io.netty.resolver.DefaultAddressResolverGroup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import reactor.netty.http.client.HttpClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UmsApiGatewayApplication {

    @Bean
    public HttpClient httpClient(){
        return HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
    }

    public static void main(String[] args) {
        SpringApplication.run(UmsApiGatewayApplication.class, args);
    }

}
