package com.iben.sanitation.dto;

import com.iben.sanitation.utils.MyBitUtil;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Objects;

/**
 * 路线选项(bit 1 是否开启清扫 b1,bit 2 是否开启洒水 b10,bit 3 是否开启抑尘 b100,bit 4 是否有隔离带 b1000)
 *
 * @author qquan
 * @date 2024-07-10 23:06
 */
@Data
public class LineOptions {


    @Schema(description = "是否开启清扫")
    private Boolean enablePurling = false;

    @Schema(description = "是否开启洒水")
    private Boolean enableSweep = false;

    @Schema(description = "是否开启抑尘")
    private Boolean enableDedust = false;

    @Schema(description = "是否有隔离带")
    private Boolean greenbeltIsolation = false;


    // 转化为数据库存值
    public Integer convertToInt() {
        boolean[] values = {enablePurling, enableSweep, enableDedust, greenbeltIsolation};
        int result = 0;
        for (int i = 0; i < 4; i++) {
            // Shift the existing bits one place to the left
            result <<= 1;

            // Add the next bit based on the boolean value
            if (values[i]) {
                result |= 1;
            }
        }

        return result;
    }

    // 数值转object
    public void convertToLineOptions(Integer lineOptionsInt){

        if(Objects.isNull(lineOptionsInt)|| lineOptionsInt<=0){
            // 当输入值是null时
            return;
        }

        enablePurling = MyBitUtil.valueAtBit(lineOptionsInt,0);
        enableSweep = MyBitUtil.valueAtBit(lineOptionsInt,1);
        enableDedust = MyBitUtil.valueAtBit(lineOptionsInt,2);
        greenbeltIsolation = MyBitUtil.valueAtBit(lineOptionsInt,3);

    }

}
