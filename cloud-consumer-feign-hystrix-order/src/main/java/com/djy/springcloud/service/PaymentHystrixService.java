package com.djy.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author dengjunyang
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackService.class)//表示FeignClient注解的作用目标在接口上
public interface PaymentHystrixService {
  /**
   * 正常访问
   *
   * @param id
   * @return
   */
  @GetMapping("/payment/hystrix/ok/{id}")
  String paymentInfo_OK(@PathVariable("id") Integer id);

  /**
   * 超时访问
   *
   * @param id
   * @return
   */
  @GetMapping("/payment/hystrix/timeout/{id}")
  String paymentInfo_TimeOut(@PathVariable("id") Integer id);

}
