package com.wufan.vueblog.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Author: songw
 * @DATE: 2020/9/26 15:01
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String jwt){
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
