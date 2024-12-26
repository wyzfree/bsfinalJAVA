package com.wyz.mapper;

import com.wyz.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {


    // 根据用户名查询
    @Select("select * from x_user where username = #{username}")
    User findByUsername(String username);

    @Select("select * from x_user where email = #{email}")
    User findByEmail(String email);


    // 添加
    // 如果是商品的时间，直接写now()
    @Insert("insert into x_user (username, password, email) values(#{username}, #{password}, #{email})")
    void add(String username, String password, String email);

    // 目前就支持改邮箱
    @Update("update x_user set email = #{email} where id = #{id}")
    void update(User user);

    @Update("update x_user set password = #{md5String} where id = #{id}")
    void updatePwd(String md5String, Integer id);
}
