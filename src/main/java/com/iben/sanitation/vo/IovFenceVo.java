package com.iben.sanitation.vo;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @author qquan
 * @date 2024-07-13 11:16
 */
public class IovFenceVo {

    @Schema(description = "关联的围栏ID （便于直接获取围栏点位信息或业务）")
    private Long fenceId;

    @Schema(description = "线路名称")
    private String lineName;

    @Schema(description = "实体路标签属性 例如 （芙蓉路(翡翠路-天都路)，芙蓉路（翡翠路-宝塔路））(一条line只能属于一条road，选好road后，如果默认保洁等级为空，会设置默认保洁等级，路线选项及洒水清扫抑尘躺数和方向和线路宽度，每条line的这些属性都可以自定义)")
    private Long roadLabelId;

    @Schema(description = "[必填] 保洁等级 （道路的保洁等级 1 一级，2 二级，3 三级）")
    private Integer cleanLevel;

    @Schema(description = "起止位置-开始线路")
    private String startPointName;

    @Schema(description = "起止位置-结束线路")
    private String endPointName;

    @Schema(description = "所属片区（行政区划表 iov_administrative_division 请求参数 deep=3,pid = 340125，默认第一个，显示localName，存入adId字段的值）")
    private Long communityCode;

    @Schema(description = "路线选项(bit 1 是否开启清扫 b1,bit 2 是否开启洒水 b10,bit 3 是否开启抑尘 b100,bit 4 是否有隔离带 b1000)")
    private Integer lineOptions;

    @Schema(description = "洒水趟数 整数 1")
    private Integer purlingCount;

    @Schema(description = "清扫趟数 整数 1")
    private Integer sweepCount;

    @Schema(description = "抑尘趟数 整数 1")
    private Integer dedustCount;

    @Schema(description = "洒水方向 1 单向 2 双向")
    private Integer purlingDirection;

    @Schema(description = "清扫方向 1 单向 2 双向")
    private Integer sweepDirection;

    @Schema(description = "抑尘方向 1 单向 2 双向")
    private Integer dedustDirection;

    @Schema(description = "线路长度 单位米double 0.00")
    private Double lineLength;

    @Schema(description = "线路宽度 单位米double 0.00")
    private Double lineWidth;

    @Schema(description = "线路面积 单位立方米double 0.00")
    private Double lineArea;

    @Schema(description = "位置信息")
    private String locationInfo;

}
