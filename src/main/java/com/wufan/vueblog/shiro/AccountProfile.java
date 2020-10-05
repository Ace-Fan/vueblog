package com.wufan.vueblog.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: songw
 * @DATE: 2020/9/26 20:40
 */

@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;
}
