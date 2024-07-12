package com.iben.sanitation.utils;

/**
 *
 * @author qquan
 * @date 2024-07-12 16:10
 */
public class MyBitUtil {

    /**
     * 二进制取值取
     * @param num
     * @param bit
     * @return
     */
    public static Boolean valueAtBit(int num, int bit) {
        int b = (num >> (bit)) & 1;
        return b == 1;
    }

}
