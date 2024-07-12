package com.iben.sanitation.advice;


import com.iben.sanitation.enums.ReturnCodeType;
import com.iben.sanitation.exception.BusinessException;
import com.iben.sanitation.msg.ResponseModel;
import com.iben.sanitation.utils.LoggerUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import java.util.List;


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

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public <T> ResponseModel<T> constraintViolationException(HttpServletRequest request, ConstraintViolationException ex) {
        LOGGER.error(request.getRequestURI(), ex.getMessage(), ex);
        return ResponseModel.error(ReturnCodeType.PARAMETER_VALIDATE_ERROR,ex.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = Exception.class)
    public <T> ResponseModel<T> exceptionHandler(HttpServletRequest request,Exception ex) {
        LOGGER.error(request.getRequestURI(), ex.getMessage(), ex);
        if (ex instanceof BusinessException) {
            return ResponseModel.error(((BusinessException) ex).getReturnCodeType(),"请求有误, 请稍后再试: " + ex.getMessage());
        }
        else if (ex instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException exception = (MethodArgumentNotValidException) ex;
            List<ObjectError> allErrors = exception.getBindingResult().getAllErrors();
            StringBuilder msgBuilder = new StringBuilder();
            for (ObjectError allError : allErrors) {
                msgBuilder.append(allError.getDefaultMessage()).append("; ");
            }
            return ResponseModel.error(ReturnCodeType.PARAMETER_VALIDATE_ERROR,"参数校验错误:" + msgBuilder);
        }
        return ResponseModel.error(ReturnCodeType.PARAMETER_VALIDATE_ERROR,ex.getMessage());
    }


}
