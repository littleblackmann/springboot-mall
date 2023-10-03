package com.ltiileblack.springbootmall.dao;

import com.ltiileblack.springbootmall.dto.ProductRequest;
import com.ltiileblack.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void  deleteProductById(Integer productId);
}
