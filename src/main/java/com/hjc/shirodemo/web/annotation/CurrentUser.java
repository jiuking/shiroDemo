package com.hjc.shirodemo.web.annotation;

import com.hjc.shirodemo.common.Constants;

import java.lang.annotation.*;

/**
 * Created by Bravowhale on 2016/12/28.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurrentUser {
    /**
     * 当前用户在request中的名字
     * @return
     */
    String value() default Constants.CURRENT_USER;
}
