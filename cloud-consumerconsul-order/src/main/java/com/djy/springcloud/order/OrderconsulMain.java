package com.djy.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderconsulMain {
  public static void main(String[] args) {
    SpringApplication.run(OrderconsulMain.class,args);
  }
}
