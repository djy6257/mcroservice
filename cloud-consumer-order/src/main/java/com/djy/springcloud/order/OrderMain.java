package com.djy.springcloud.order;


import com.djy.springcloud.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 支付消费者
 * @author dengjunyang
 */
@SpringBootApplication
@EnableEurekaClient
//自定义负载均衡规则,name为生产者服务的服务名称,configuration为配置类的类名
@RibbonClient(name = "mcroservice-payment",configuration = MyselfRule.class)
public class OrderMain {

  public static void main(String[] args) {
    SpringApplication.run(OrderMain.class, args);
  }
}
