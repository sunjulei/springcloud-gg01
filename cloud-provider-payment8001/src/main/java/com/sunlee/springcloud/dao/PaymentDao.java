package com.sunlee.springcloud.dao;

import com.sunlee.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author sunlee
 * @date 2020/8/9 13:14
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") long id);
}
