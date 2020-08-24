package com.sunlee.springcloud.service;

import com.sunlee.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author sunlee
 * @date 2020/8/9 13:29
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") long id);
}
