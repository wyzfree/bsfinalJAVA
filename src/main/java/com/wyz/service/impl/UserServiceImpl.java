package com.wyz.service.impl;

import com.wyz.mapper.UserMapper;
import com.wyz.pojo.User;
import com.wyz.service.UserService;
import com.wyz.utils.Md5Util;
import com.wyz.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        User u = userMapper.findByUsername(username);
        return u;
    }

    @Override
    public User findByEmail(String email) {
        User u = userMapper.findByEmail(email);
        return u;
    }

    @Override
    public void register(String username, String password, String email) {
        // 加密
        String md5String = Md5Util.getMD5String(password);
        // 添加
        userMapper.add(username, md5String, email);
    }

    @Override
    // 目前只支持修改邮箱
    public void update(User user) {
        /*
        * user.setUpdateTime(LocalDateTime.now());
        * product.setUpdateTime(LocalDateTime.now());
        * */
        userMapper.update(user);

    }

    @Override
    public void updatePwd(String newpwd) {
        // 加密
        String md5String = Md5Util.getMD5String(newpwd);
        // 更新
        Map<String, Object> map = ThreadLocalUtil.get();
        Integer id = (Integer) map.get("id");
        userMapper.updatePwd(md5String, id);
    }
}
