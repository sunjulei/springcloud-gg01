package com.sunlee.springcloud.service.impl;

import com.sunlee.springcloud.dao.PaymentDao;
import com.sunlee.springcloud.entites.Payment;
import com.sunlee.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author sunlee
 * @date 2020/8/9 13:30
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
