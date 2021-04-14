package com.djy.springcloud.order.controller;

import com.djy.springcloud.pojo.CommonResult;
import com.djy.springcloud.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dengjunyang
 */
@RestController
@Slf4j
public class OrderController {
  //调用支付订单服务端的ip+端口号
  public static final String PAYMENT_URL = "http://MCROSERVICE-PAYMENT";

  @Autowired
  private RestTemplate restTemplate;

  /**
   * 创建支付订单的接口
   * @param payment
   * @return
   */
  @PostMapping ("/consumer/payment/create")
  public CommonResult<Payment> creat(Payment payment){
    return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);
  }

  /**
   * 获取支付订单
   * @param id
   * @return
   */
  @GetMapping("/consumer/payment/get/{id}")
  public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
    return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
  }


}
