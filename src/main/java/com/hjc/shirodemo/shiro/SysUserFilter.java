package com.hjc.shirodemo.shiro;

import com.hjc.shirodemo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Bravowhale on 2016/12/28.
 */
public class SysUserFilter extends PathMatchingFilter{
    @Autowired
    private UserService userService;

    @Override
    protected boolean onPreHandler(ServletC){
        String username = SecurityUtils.
    }
}
