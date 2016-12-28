package com.hjc.shirodemo.shiro;

import com.hjc.shirodemo.common.Constants;
import com.hjc.shirodemo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by Bravowhale on 2016/12/28.
 */
public class SysUserFilter extends PathMatchingFilter{
    @Autowired
    private UserService userService;

    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        String username = (String) SecurityUtils.getSubject().getPrincipal();
        request.setAttribute(Constants.CURRENT_USER,username);
        return true;
    }
}
