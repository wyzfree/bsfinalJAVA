package com.wyz.mapper;

import com.wyz.pojo.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface ProductMapper {

    // 根据pid查询
    @Select("select * from x_product where pid = #{pid}")
    List<Product>  findByPid(String pid);

    // 添加商品
    @Insert("insert into x_product (pid, pname, price, ptime) values (#{sqlPid}, #{sqlPname}, #{sqlPrice}, NOW(3))")
    void add(String sqlPid, String sqlPname, BigDecimal sqlPrice);

    // 获得数据库的全部商品
    @Select("SELECT pid, pname, price, ptime FROM x_product")
    List<Product> getAllProducts();

    // 删除该追踪的商品
    @Delete("delete from x_product WHERE pid = #{pid}")
    void deleteProduct(String pid);
}
