package com.iben.sanitation.utils;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @desc: 日志记录
 * @version: 1.0
 */
public class LoggerUtils {

    private Logger logger;

    /**
     * 按名称构造
     *
     * @param name 名称
     */
    private LoggerUtils(String name) {
        logger = LoggerFactory.getLogger(name);
    }

    /**
     * 按类构造
     *
     * @param clazz 类
     */
    private LoggerUtils(Class<?> clazz) {
        logger = LoggerFactory.getLogger(clazz);
    }

    /**
     * 获取对象
     *
     * @param name 名称
     * @return LoggerUtils
     */
    public static LoggerUtils getLogger(String name) {
        return new LoggerUtils(name);
    }

    /**
     * 获取对象
     *
     * @param clazz 类
     * @return LoggerUtils
     */
    public static LoggerUtils getLogger(Class<?> clazz) {
        return new LoggerUtils(clazz);
    }

    /**
     * 格式化消息
     *
     * @param methodName 方法名
     * @param message    错误信息
     * @return String
     */
    private String getMessage(String methodName, String message) {

        StringBuilder sb = new StringBuilder();
        if (!StringUtils.isBlank(methodName)) {
            sb.append(methodName);
        }
        if (!StringUtils.isBlank(message)) {
            sb.append(message);
        }

        return sb.toString();
    }

    /**
     * 输出 info
     *
     * @param methodName 方法名
     * @param message    错误信息
     * @param t          void
     */
    public void info(String methodName, String message, Throwable t) {
        if (!logger.isInfoEnabled()) {
            return;
        } else {

            logger.info(getMessage(methodName, message), t);
            return;
        }
    }

    /**
     * 输出 info
     *
     * @param methodName 方法名
     * @param message    void
     */
    public void info(String methodName, String message) {
        if (!logger.isInfoEnabled()) {
            return;
        } else {

            logger.info(getMessage(methodName, message));
            return;
        }
    }

    /**
     * 输出 debug
     *
     * @param methodName 方法名
     * @param message    错误信息
     * @param t          void
     */
    public void debug(String methodName, String message, Throwable t) {
        if (!logger.isDebugEnabled()) {
            return;
        } else {

            logger.debug(getMessage(methodName, message), t);
            return;
        }
    }

    /**
     * 输出 debug
     *
     * @param methodName 方法名
     * @param message    void
     */
    public void debug(String methodName, String message) {
        if (!logger.isDebugEnabled()) {
            return;
        } else {

            logger.debug(getMessage(methodName, message));
            return;
        }
    }

    /**
     * 输出 warn
     *
     * @param methodName 方法名
     * @param message    错误信息
     * @param t          void
     */
    public void warn(String methodName, String message, Throwable t) {
        logger.warn(getMessage(methodName, message), t);
    }

    /**
     * 输出 warn
     *
     * @param methodName 方法名
     * @param message    void
     */
    public void warn(String methodName, String message) {
        logger.warn(getMessage(methodName, message));
    }

    /**
     * 输出 error
     *
     * @param methodName 方法名
     * @param message    错误信息
     * @param t          void
     */
    public void error(String methodName, String message, Throwable t) {
        logger.error(getMessage(methodName, message), t);
    }

    /**
     * 输出 error
     *
     * @param methodName 方法名
     * @param message    void
     */
    public void error(String methodName, String message) {
        logger.error(getMessage(methodName, message));
    }


}
