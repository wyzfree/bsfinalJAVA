package com.wyz.service;

import com.wyz.pojo.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    void add(String sqlPid, String sqlPname, BigDecimal sqlPrice);

    List<Product>  findByPid(String pid);


    List<Product> getAllProducts();

    void deleteProduct(String pid);
}
