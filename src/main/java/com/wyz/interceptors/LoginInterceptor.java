package com.wyz.interceptors;

import com.wyz.utils.JwtUtil;
import com.wyz.utils.ThreadLocalUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Map;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 令牌验证
        String token = request.getHeader("Authorization");
        // 验证token
        try {
            Map<String, Object> claims = JwtUtil.parseToken(token);
            // 把业务数据存到threadlocal里面
            ThreadLocalUtil.set(claims);
            // 放行
            return true;
        } catch (Exception e) {
            // http相应状态码为401
            response.setStatus(401);
            return false; // 不放行
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) throws Exception{
        // 情况threadlocal数据
        ThreadLocalUtil.remove();
    }
}
