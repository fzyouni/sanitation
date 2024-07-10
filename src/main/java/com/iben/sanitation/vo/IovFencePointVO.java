package com.iben.sanitation.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 围栏点位vo
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/08 10:02
 */
@Data
public class IovFencePointVO {

    @Schema(description = "围栏点位ID")
    private Long fencePointId;

    @Schema(description = "经度（小数点后6位）")
    private Double lng;

    @Schema(description = "纬度（小数点后6位）")
    private Double lat;

    @Schema(description = "顺序")
    private Integer sort;

    @Schema(description = "经纬度坐标系类型 （1 WGS84 - 原始坐标系, 2 GCJ02 国测局标准/火星坐标系/高德地图使用,3 BD09 百度坐标系/百度地图使用,4 CGCS2000 国家大地坐标系；基础数据-字典表 请求参数 parent = CoordinateType，用户选择后，存入dictCode字段的值）（包含相关的iov_fence_point 围栏点位表的坐标类型）")
    private Integer coordinateType;


}
