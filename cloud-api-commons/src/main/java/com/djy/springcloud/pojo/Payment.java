package com.djy.springcloud.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 网络通信 一定要实现序列化
 */
@Data
@NoArgsConstructor//提供一个无参的构造函数
@AllArgsConstructor//加一个构造函数，该构造函数含有所有已声明字段属性参数
@Accessors(chain = true)
public class Payment implements Serializable {
  private Long id;
  /**
   * 微服务 一个服务对应一个数据库，同一个信息可能存在不同的数据库
   */
  private String serial;
}
