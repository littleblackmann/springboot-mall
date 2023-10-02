package com.ltiileblack.springbootmall.dao;

import com.ltiileblack.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

}
