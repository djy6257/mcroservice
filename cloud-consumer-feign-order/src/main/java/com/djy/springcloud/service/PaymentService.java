package com.djy.springcloud.service;

import com.djy.springcloud.pojo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@ComponentScan
@FeignClient(value ="mcroservice-payment")//使用Feign
public interface PaymentService {

  /**
   * 调用生产者微服务名称为mcroservice-payment下边的接口
   * @param id
   * @return
   */
  @GetMapping("/payment/get/{id}")
  public CommonResult queryById(@PathVariable("id") Long id);

  /**
   * 调用生产者微服务名称为mcroservice-payment下边的模拟超时的接口
   * @return
   * @throws InterruptedException
   */
  @GetMapping("/payment/feign/timeout")
  public String PaymentFeignTimeOut() throws InterruptedException;

}
