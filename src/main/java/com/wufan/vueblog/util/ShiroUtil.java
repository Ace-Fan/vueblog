package com.wufan.vueblog.util;

import com.wufan.vueblog.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @Author: songw
 * @DATE: 2020/9/29 23:48
 */
public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
