package com.ltiileblack.springbootmall.dao;

import com.ltiileblack.springbootmall.dto.ProductRequest;
import com.ltiileblack.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

}
