package com.iben.sanitation.exception;


import com.iben.sanitation.enums.ReturnCodeType;
import lombok.Getter;

/**
 * @version 1.0
 * @program: platform
 * @description: 业务异常
 * @author: Ben
 * @create: 2019/04/28 09:50
 */
@Getter
public class BusinessException extends Exception {


    private final ReturnCodeType returnCodeType;

    /**
     * @param returnCodeType 异常类型枚举
     */
    public BusinessException(ReturnCodeType returnCodeType) {
        super();
        this.returnCodeType = returnCodeType;
    }

    /**
     * @param returnCodeType 异常类型枚举
     * @param message        自定义异常消息，用于覆盖默认异常消息
     */ 
    public BusinessException(ReturnCodeType returnCodeType, String message) {
        super(message);
        this.returnCodeType = returnCodeType;
        this.returnCodeType.setValue(message);
    }

}
