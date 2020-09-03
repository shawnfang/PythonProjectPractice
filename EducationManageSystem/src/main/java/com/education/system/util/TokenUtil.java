package com.education.system.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.education.system.pojo.SchoolInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class TokenUtil {

    private static final long EXPIRE_TIME= 15*60*1000;
    private static final String TOKEN_SECRET="token123";  //密钥盐
    private final static Logger logger = LoggerFactory.getLogger(TokenUtil.class);


    /**
     * 签名生成
     * @param user
     * @return
     */
    public static String sign(SchoolInfo user){

        String token = null;
        try {
            Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            token = JWT.create()
                    .withIssuer("auth0")
                    .withClaim("username", user.getAccount())
                    .withExpiresAt(expiresAt)
                    // 使用了HMAC256加密算法。
                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
        } catch (Exception e){
            e.printStackTrace();
        }
        return token;

    }


    /**
     * 签名验证
     * @param token
     * @return
     */
    public static boolean verify(String token){

        logger.info("token："+token);
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("auth0").build();
            DecodedJWT jwt = verifier.verify(token);
            logger.info("认证通过："+jwt.getToken());
            logger.info("issuer: " + jwt.getIssuer());
            logger.info("username: " + jwt.getClaim("username").asString());
            logger.info("过期时间：" + jwt.getExpiresAt());
            return true;
        } catch (Exception e){
            return false;
        }

    }

    public static String parseToken(String token){
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("auth0").build();
        DecodedJWT jwt = verifier.verify(token);
        return jwt.getClaim("username").asString();
    }
}