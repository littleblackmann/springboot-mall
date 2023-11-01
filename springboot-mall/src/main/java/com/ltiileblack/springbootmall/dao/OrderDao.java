package com.ltiileblack.springbootmall.dao;


import com.ltiileblack.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId ,Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}