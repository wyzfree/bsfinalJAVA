package com.wyz.controller;

import com.wyz.pojo.Result;
import com.wyz.pojo.User;
import com.wyz.service.UserService;
import com.wyz.utils.EmailUtil;
import com.wyz.utils.JwtUtil;
import com.wyz.utils.Md5Util;
import com.wyz.utils.ThreadLocalUtil;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Validated
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @Autowired
    private UserService userService;

    // 注册，我认为注册需要三个参数，和教程不一样，注意一下
    @PostMapping("/register")
    public Result register(@Pattern(regexp = "^\\S{2,100}$") String username, String password, String email) {
        // 基础格式校验
        if (password == null) {
            return Result.error("密码为空");
        }
        if (password.length() < 6) {
            return Result.error("密码长度小于6");
        }
        if (password.length() > 100) {
            return Result.error("密码长度大于100");
        }
        if (!EmailUtil.isValidEmail(email)) {
            return Result.error("邮箱格式不正确后端，当前的邮箱是："+email);
        }

        // 查询用户 和 邮箱
        User uname = userService.findByUsername(username);
        User uemail = userService.findByEmail(email);
        if (uname == null && uemail == null) {
            // 两个都不重复才是对的，可以注册
            userService.register(username, password, email);
            return Result.success();
        } else {
            if (uname != null) {
                // 用户名重复
                return Result.error("用户名重复");
            } else {
                // 邮箱重复
                return Result.error("邮箱重复");
            }
        }
    }


    // 登录
    @PostMapping("/login")
    public Result<String> login(String username, @Pattern(regexp = "^\\S{6,100}$") String password) {
        // 是否有这个用户
        User loginUser = userService.findByUsername(username);
        if (loginUser == null) {
            return Result.error("该用户不存在");
        }
        // 密码对不对
        if (Md5Util.checkPassword(password, loginUser.getPassword())) {
            // 成功
            Map<String, Object> claims = new HashMap<String, Object>();
            claims.put("id", loginUser.getId());
            claims.put("username", loginUser.getUsername());
            String token = JwtUtil.genToken(claims);
            return Result.success(token);
        } else {
            return Result.error("密码错误");
        }
    }


    // 个人信息页
    @GetMapping("/userInfo")
    public Result<User> userInfo() {

        /*@RequestHeader(name = "Authorization") String token*/
        // 解析token
//        Map<String, Object> map = JwtUtil.parseToken(token);
//        String username = (String)map.get("username");

        Map<String, Object> map =  ThreadLocalUtil.get();
        String username = (String)map.get("username");
        User user = userService.findByUsername(username);
        return Result.success(user);
    }

    @PutMapping("/update")
    public Result update(@RequestBody @Validated User user) {
        userService.update(user);

        return Result.success();
    }

    @PatchMapping("/updatePwd")
    public Result updatePwd(@RequestBody Map<String, String> params) {
        // 校验参数
        String oldpwd = params.get("oldpwd");
        String newpwd = params.get("newpwd");
        String repwd = params.get("repwd");

        if(!StringUtils.hasLength(oldpwd) || !StringUtils.hasLength(newpwd) || !StringUtils.hasLength(repwd)){
            return Result.error("参数不能为空");
        }
        // 旧密码是否正确
        Map<String, Object> map = ThreadLocalUtil.get();
        String username = (String)map.get("username");
        User loginUser = userService.findByUsername(username);
        if(!loginUser.getPassword().equals(Md5Util.getMD5String(oldpwd))){
            return Result.error("原密码错误");
        }

        // 新密码是否和确认新密码相同
        if(!newpwd.equals(repwd)){
            return Result.error("新密码和确认新密码不相同");
        }
        // 新密码是否符合要求
        if(newpwd.length() < 6 || newpwd.length() > 100){
            return Result.error("新密码长度不在6-100之间");
        }
        // 新密码是否和旧密码相同
        if(newpwd.equals(oldpwd)){
            return Result.error("新密码和旧密码相同");
        }


        // 密码更新
        userService.updatePwd(newpwd);

        return Result.success();
    }

}