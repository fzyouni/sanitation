package com.iben.sanitation.advice;

import com.iben.sanitation.enums.ReturnCodeType;
import com.iben.sanitation.exception.BusinessException;
import com.iben.sanitation.msg.ResponseModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ValidationException;

@Slf4j
@ResponseBody
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public <T> ResponseModel<T> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        return ResponseModel.errorParam(((MethodArgumentNotValidException)e)
                .getBindingResult().getFieldError().getDefaultMessage());
    }

    @ExceptionHandler(value = {ValidationException.class})
    public <T> ResponseModel<T> validationExceptionHandler(ValidationException e) {
        return ResponseModel.errorParam(e.getMessage());
    }


    @ExceptionHandler(BusinessException.class)
    public <T> ResponseModel<T> BusinessException(HttpServletRequest request, BusinessException ex) {
        log.error(request.getRequestURI(), ex.getMessage(), ex);
        return ResponseModel.error(ex.getReturnCodeType());
    }



    /**
     * 捕获异常 针对不同异常返回不同内容的固定格式信息
     * 拦截所有的异常，并且返回 json 格式的信息
     * @param request http request
     * @param exception 异常
     * @return
     */
    @ExceptionHandler(value = Throwable.class)
    public <T> ResponseModel<T> allExceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {

        exception.printStackTrace();
        log.error("global error handler {}", exception.getMessage());
        return ResponseModel.error(ReturnCodeType.OUT_ENUM_ERROR,"服务器请求超时");
    }

}
