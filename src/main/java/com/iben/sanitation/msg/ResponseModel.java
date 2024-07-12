package com.iben.sanitation.msg;

import com.iben.sanitation.enums.ReturnCodeType;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * 数据返回包装类
 *
 * @author Ben
 * @version 2.0
 * @create 2018-06-08 15:18
 **/
public class ResponseModel<T> implements Serializable {

    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

    /**
     * 返回正常异常状态
     */
    @Schema(description = "返回正常异常状态")
    private String status;
    /**
     * 返回状态编码
     */
    @Schema(description = "返回状态编码 200 success ，404 error")
    private final String code;
    /**
     * 返回信息
     */
    @Schema(description = "返回信息")
    private final String message;
    /**
     * 返回数据
     */
    @Schema(description = "返回数据")
    private T data;

    /**
     * 成功时返回封装实体对象方法
     *
     * @return 返回统一封装数据对象
     */
    public static ResponseModel<Object> success() {
        return new ResponseModel<>();
    }

    /**
     * 成功时返回封装实体对象方法
     *
     * @param message 自定义返回成功提示消息
     * @return 返回统一封装数据对象
     */
    public static ResponseModel<Object> success(String message) {
        return new ResponseModel<>(message);
    }

    /**
     * 成功时返回封装实体对象方法
     *
     * @param data 实体对象
     * @return 返回统一封装数据对象
     */
    public static <T> ResponseModel<T> success(T data) {
        return new ResponseModel<>(data);
    }


    public static <T> ResponseModel<T> success(String message, T data) {
        return new ResponseModel<>(message, data);
    }

    /**
     * 错误时返回封装错误码对象方法
     *
     * @param type 错误码枚举对象 此处必须传子类returnCodeType
     * @return 返回统一封装数据对象
     */
    public static <T> ResponseModel<T> error(ReturnCodeType type) {
        return new ResponseModel<>(type);
    }

    /**
     * 返回封装参数检验失败 的方法
     *
     * @return 返回统一封装数据对象
     */
    public static <T> ResponseModel<T> errorParam(String errorMessage) {
        return error(ReturnCodeType.PARAMETER_VALIDATE_ERROR,errorMessage);
    }


    /**
     * 错误时返回封装错误码对象方法
     *
     * @param type    错误码枚举对象 此处必须传子类returnCodeType
     * @param message 自定义错误提示消息，用于覆盖默认异常提示语
     * @return 返回统一封装数据对象
     */
    public static <T> ResponseModel<T> error(ReturnCodeType type, String message) {
        return new ResponseModel<>(type, message);
    }

    private ResponseModel() {
        this.status = SUCCESS;
        this.code = ReturnCodeType.SUCCESS.getKey();
        this.message = ReturnCodeType.SUCCESS.getValue();
    }

    private ResponseModel(String message) {
        this.status = SUCCESS;
        this.code = ReturnCodeType.SUCCESS.getKey();
        this.message = message;
    }

    private ResponseModel(T data) {
        this.status = SUCCESS;
        this.code = ReturnCodeType.SUCCESS.getKey();
        this.message = ReturnCodeType.SUCCESS.getValue();
        this.data = data;
    }

    private ResponseModel(String message, T data) {
        this.status = SUCCESS;
        this.code = ReturnCodeType.SUCCESS.getKey();
        this.message = message;
        this.data = data;
    }

    private ResponseModel(ReturnCodeType type) {
        this.status = ERROR;
        this.code = type.getKey();
        this.message = type.getValue();
    }

    private ResponseModel(ReturnCodeType type, String message) {
        this.status = ERROR;
        this.code = type.getKey();
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
