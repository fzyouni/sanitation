package com.iben.sanitation.vo;

import com.iben.sanitation.domain.IovFenceLinePO;
import com.iben.sanitation.dto.LineOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * 围栏数据vo
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/08 09:54
 */
@Data
public class IovFenceLineVO extends IovFenceLinePO {

    @Schema(description = "围栏名称")
    private String fenceName;

    @Schema(description = "围栏类型 1 标注 2 多边形 3 线路 4 行政区域 5 矩形 6 圆形")
    private Integer fenceType;

    @Schema(description = "线路实际长度（仅限线路，默认值0）")
    private Double length;

    @Schema(description = "经纬度坐标系类型 （1 WGS84 - 原始坐标系, 2 GCJ02 国测局标准/火星坐标系/高德地图使用,3 BD09 百度坐标系/百度地图使用,4 CGCS2000 国家大地坐标系；基础数据-字典表 请求参数 parent = CoordinateType，用户选择后，存入dictCode字段的值）（包含相关的iov_fence_point 围栏点位表的坐标类型）")
    private Integer coordinateType;

    @Schema(description = "围栏的点位列表")
    private List<IovFencePointVO> pointList;


    @Schema(description = "路线选项(bit 1 是否开启清扫 b1,bit 2 是否开启洒水 b10,bit 3 是否开启抑尘 b100,bit 4 是否有隔离带 b1000)")
    private LineOptions lineOptionsOb;

    // int lineOptions 转 lineOptionsOb
    @Override
    public void setLineOptions(Integer lineOptions) {

        LineOptions options = new LineOptions();

        options.convertToLineOptions(lineOptions);

    }
}
