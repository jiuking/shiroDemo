package com.hjc.shirodemo.web.method;

import com.hjc.shirodemo.web.annotation.CurrentUser;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * 用户绑定@FormModel的方法参数解析器
 * Created by Bravowhale on 2016/12/28.
 */
public class CurrentUserMethodArgumentResolver implements HandlerMethodArgumentResolver{

    public CurrentUserMethodArgumentResolver(){

    }

    public boolean supportsParameter(MethodParameter methodParameter) {
        if(methodParameter.hasParameterAnnotation(CurrentUser.class))
            return true;
        return false;
    }

    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        CurrentUser currentUser = methodParameter.getParameterAnnotation(CurrentUser.class);
        return nativeWebRequest.getAttribute(currentUser.value(),NativeWebRequest.SCOPE_REQUEST);
    }
}
