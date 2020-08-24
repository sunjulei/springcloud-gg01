package com.sunlee.springcloud.controller;

import com.sunlee.springcloud.entites.CommonResult;
import com.sunlee.springcloud.entites.Payment;
import com.sunlee.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author sunlee
 * @date 2020/8/9 13:32
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String servicePort;

    //    @GetMapping(value = "/payment/create")
    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info(payment.getSerial());
        log.info("*****插入结果:" + result);
        if (result > 0) {
            return new CommonResult(200, "插入成功", result);
        } else {
            return new CommonResult(444, "插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult get(@PathVariable("id") long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,servicePort" + servicePort, payment);
        } else {
            return new CommonResult(444, "查询失败", null);
        }
    }
}
