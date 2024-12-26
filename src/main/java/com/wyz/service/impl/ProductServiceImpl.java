package com.wyz.service.impl;

import com.wyz.mapper.ProductMapper;
import com.wyz.pojo.Product;
import com.wyz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findByPid(String pid) {
        List<Product>  productList = productMapper.findByPid(pid);
        return productList;
    }

    @Override
    public void add(String sqlPid, String sqlPname, BigDecimal sqlPrice){
        productMapper.add(sqlPid, sqlPname, sqlPrice);
    }

    @Override
    public List<Product> getAllProducts(){
        return productMapper.getAllProducts();
    }

    @Override
    public void deleteProduct(String pid){
        productMapper.deleteProduct(pid);
    }
}
