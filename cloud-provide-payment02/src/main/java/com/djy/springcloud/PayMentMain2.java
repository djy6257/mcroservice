package com.djy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 支付生产者
 * @author dengjunyang
 */
@SpringBootApplication
@EnableEurekaClient
public class PayMentMain2 {

  public static void main(String[] args) {
    SpringApplication.run(PayMentMain2.class, args);
  }
}
