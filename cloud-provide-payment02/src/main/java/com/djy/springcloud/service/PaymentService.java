package com.djy.springcloud.service;

import com.djy.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author dengjunyang
 */
public interface PaymentService {
  int create(Payment payment);

  Payment queryById(@Param("id")long id);

}
