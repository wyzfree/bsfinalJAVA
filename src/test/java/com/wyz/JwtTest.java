package com.wyz;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {
    @Test
    public void testGen() {
        Map<String, Object> claims = new HashMap<String, Object>();
        claims.put("id", 1);
        claims.put("username", "zhangsan");
        // 生成jwt
        String token = JWT.create()
                .withClaim("user", claims)  // 添加载荷
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000*60*60*12))   //添加过期时间,12h
                .sign(Algorithm.HMAC256("xavier"));

        System.out.println(token);
    }

    @Test
    public void testParse(){
        // 模拟用户的token
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                ".eyJ1c2VyIjp7ImlkIjoxLCJ1c2VybmFtZSI6InpoYW5nc2FuIn0sImV4cCI6MTczNDY0NDMyNX0" +
                ".EmCz4MIIUYcrZtEUQHxSWaNIUZY2opN82rNNJixMps4";
        JWTVerifier jwtverifier = JWT.require(Algorithm.HMAC256("xavier")).build();
        DecodedJWT decodedjwt = jwtverifier.verify(token);  // 验证token，生成解析后的jwt对象
        Map<String, Claim> claims = decodedjwt.getClaims();
        System.out.println(claims.get("user"));


    }
}
