package com.djy.springcloud.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 * @author dengjunyang
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain {
  public static void main(String[] args) {
    SpringApplication.run(EurekaMain.class,args);
  }
}
