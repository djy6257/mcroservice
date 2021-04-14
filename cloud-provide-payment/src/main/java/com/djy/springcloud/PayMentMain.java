package com.djy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 支付生产者
 * @author dengjunyang
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PayMentMain {

  public static void main(String[] args) {
    SpringApplication.run(PayMentMain.class, args);
  }
}
