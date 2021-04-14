package com.djy.springcloud.controller;

import com.djy.springcloud.pojo.CommonResult;
import com.djy.springcloud.pojo.Payment;
import com.djy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * 提供restful服务  供其他服务调用
 * @author dengjunyang
 */
@RestController
@Slf4j
public class PaymentController {

  @Autowired
  private PaymentService paymentService;

  @Value("${server.port}")
  private String serverPort;

  @PostMapping("/payment/create")
  public CommonResult create(@RequestBody Payment dept) {
    int i = paymentService.create(dept);
    log.info("***************插入成功*******" + i);
    if (i > 0) {
      return new CommonResult(200, "插入数据库成功" + serverPort, i);
    } else {
      return new CommonResult(444, "插入数据库失败", null);
    }
  }

  @GetMapping("/payment/get/{id}")
  public CommonResult queryById(@PathVariable("id") Long id) {
    Payment payment = paymentService.queryById(id);
    log.info("***************查询成功*********" + payment);
    if (payment != null) {
      return new CommonResult(200, "查询成功" + serverPort, payment);
    } else {
      return new CommonResult(444, "查询失败", null);
    }
  }
}



