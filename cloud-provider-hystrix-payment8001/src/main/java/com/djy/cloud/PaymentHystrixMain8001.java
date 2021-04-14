package com.djy.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dengjunyang
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//激活业务类上加的@HystrixCommand注解
public class PaymentHystrixMain8001 {
  public static void main(String[] args) {
    SpringApplication.run(PaymentHystrixMain8001.class, args);
  }
}
