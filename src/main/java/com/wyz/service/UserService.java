package com.wyz.service;

import com.wyz.pojo.User;

public interface UserService {
    // 根据用户名查询用户
    User findByUsername(String username);

    User findByEmail(String email);

    // 注册
    void register(String username, String password, String email);

    // 更新
    void update(User user);

    // 更新密码
    void updatePwd(String newpwd);
}
