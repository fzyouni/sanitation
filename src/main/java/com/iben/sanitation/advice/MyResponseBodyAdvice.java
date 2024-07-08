package com.iben.sanitation.advice;

import com.iben.sanitation.msg.ResponseModel;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 响应拦截器,如果返回实体没有统一，则给包装成统一格式，如果已经是ResponseModel类型，则直接返回
 *
 * @author Ben <fzyouni@163.com>
 * @create 2020-09-10 13:55
 **/
@ControllerAdvice(basePackages = "com.iben.sanitation.controller")
public class MyResponseBodyAdvice implements ResponseBodyAdvice {

    /**
     * 判断是否要执行beforeBodyWrite方法，true为执行，false不执行
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class clazz) {
        return methodParameter.hasMethodAnnotation(PostMapping.class) || methodParameter.hasMethodAnnotation(GetMapping.class);
    }


    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (o instanceof ResponseModel) {
            return o;
        } else {
            return ResponseModel.success(o);
        }
    }
}
