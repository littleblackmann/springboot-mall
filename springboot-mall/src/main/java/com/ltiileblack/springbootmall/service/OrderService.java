package com.ltiileblack.springbootmall.service;

import com.ltiileblack.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
