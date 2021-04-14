package com.djy.springcloud.dao;

import com.djy.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author dengjunyang
 */
@Mapper
@Repository
public interface PaymentDao {
  int create(Payment payment);
  Payment queryById(@Param("id")long id);

}
