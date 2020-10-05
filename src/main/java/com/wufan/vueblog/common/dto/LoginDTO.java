package com.wufan.vueblog.common.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @Author: songw
 * @DATE: 2020/9/27 15:22
 */
@Data
public class LoginDTO implements Serializable {

    @NotBlank(message = "用户名不为空")
    private String username;

    @NotBlank(message = "密码不为空")
    private String password;
}
