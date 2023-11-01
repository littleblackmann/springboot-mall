package com.ltiileblack.springbootmall.service;

import com.ltiileblack.springbootmall.dto.CreateOrderRequest;
import com.ltiileblack.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
