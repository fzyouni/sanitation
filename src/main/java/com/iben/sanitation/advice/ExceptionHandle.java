package com.iben.sanitation.advice;


import com.iben.sanitation.enums.ReturnCodeType;
import com.iben.sanitation.exception.BusinessException;
import com.iben.sanitation.msg.ResponseModel;
import com.iben.sanitation.utils.LoggerUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;


/**
 * @program: platform
 * @description: controller基本操作
 * @author: Ben
 * @create: 2019/07/12 16:27
 */
public class ExceptionHandle {

    private static final LoggerUtils LOGGER = LoggerUtils.getLogger(ExceptionHandle.class);

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public <T> ResponseModel<T> handleException(HttpServletRequest request, Exception ex) {
        if (ex instanceof BusinessException) {
            BusinessException bex = (BusinessException) ex;
            return ResponseModel.error(bex.getReturnCodeType());
        }
        LOGGER.error(request.getRequestURI(), ex.getMessage(), ex);
        return ResponseModel.error(ReturnCodeType.UNKNOWN_ERROR, ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public <T> ResponseModel<T> BusinessException(HttpServletRequest request, BusinessException ex) {
        LOGGER.error(request.getRequestURI(), ex.getMessage(), ex);
        return ResponseModel.error(ex.getReturnCodeType());
    }
}
