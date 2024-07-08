package com.iben.sanitation.enums;

/**
 * 定义常量
 *
 * @author Ben
 * @create 2019-10-14 20:44
 **/
public class ConstantsType {
    /**
     * 数据状态枚举类
     */
    public enum DataStateEnum implements BaseEnum {
        //已删除标志
        DELETE_FLAG("1", "已删除"),
        //未删除标志
        EXIST_FLAG("0", "未删除");


        private final String key;
        private String value;

        DataStateEnum(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public void setValue(String value) {
            this.value = value;
        }

    }



}
