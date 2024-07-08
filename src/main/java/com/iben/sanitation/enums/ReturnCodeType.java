package com.iben.sanitation.enums;

/**
 * 后台返回状态枚举
 *
 * @author Ben
 * @version 1.0
 * @date 2019/4/28 15:26
 */
public enum ReturnCodeType implements BaseEnum {

    //通用返回
    SUCCESS("200", "success"),
    ERROR("404", "error"),

    //未知异常
    UNKNOWN_ERROR("400200", "未知异常错误！"),

    //通用异常
    PARAMETER_NULL_ERROR("400101", "参数为空！"),
    PARAMETER_VALIDATE_ERROR("400102", "参数不合法！"),
    REPEAT_OPERATION_ERROR("400104", "重复操作异常！"),
    RETURN_NULL_ERROR("400105", "返回结果为空异常"),
    OUT_ENUM_ERROR("400106", "枚举溢出异常！"),
    RETURN_REPEAT_VALUE_ERROR("400107", "值重复异常！"),
    DELETE_EXIST_RELY_ERROR("400108", "删除值存在依赖异常！"),
    VALUE_EXIST_ERROR("400109", "值存在异常！"),

    //登陆业务异常
    ACCOUNT_PASSWORD_ERROR("400201", "密码错误异常！"),
    ACCOUNT_FREEZE_ERROR("400202", "帐号被冻结！"),
    ACCOUNT_NOT_EXIST_ERROR("400203", "该账户不存在！"),
    ACCOUNT_NOT_ACTIVE_ERROR("400204", "该账户未激活！"),
    USER_NOT_LOGIN_ERROR("400205", "用户未登陆系统！");


    ReturnCodeType(String key, String value) {
        this.key = key;
        this.value = value;
    }

    private final String key;

    private String value;

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "key:" + key + ", value:" + value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }
}
