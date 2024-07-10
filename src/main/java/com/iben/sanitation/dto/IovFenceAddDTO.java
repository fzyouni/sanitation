package com.iben.sanitation.dto;

import com.iben.sanitation.domain.IovFenceLinePO;
import com.iben.sanitation.domain.IovFencePO;
import com.iben.sanitation.domain.IovFencePointPO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IovFenceAddDTO implements Serializable {


    @Getter
    private IovFencePO fencePO;

    @Getter
    private IovFenceLinePO linePO;


    @Getter
    @Setter
    @Schema(description = "围栏的点位列表")
    private List<IovFencePointPO> pointList;

//    public IovFenceAddDto(IovFencePo fencePo, IovFenceLinePo linePo, List<IovFencePointPo> pointList) {
//        this.fencePo = fencePo;
//        this.linePo = linePo;
//        this.pointList = pointList;
//    }

    public IovFenceAddDTO() {
        this.fencePO = new IovFencePO();
        this.linePO = new IovFenceLinePO();
        this.pointList = new ArrayList<IovFencePointPO>();
    }


    @Schema(description = "部门id（客户）")
    private Integer customerId;

    @Schema(description = "围栏名称")
    private String fenceName;

    @Schema(description = "围栏类型 1 标注 2 多边形 3 线路 4 行政区域 5 矩形 6 圆形")
    private Integer fenceType;

    @Schema(description = "线路实际长度（仅限线路，默认值0）")
    private Double length;

    @Schema(description = "半径（仅限标注/圆形，默认值0）")
    private Double radius;

    @Schema(description = "区域面积(仅限多边形/矩形/圆形，默认值0)")
    private Double area;

    @Schema(description = "经纬度坐标系类型 （1 WGS84 - 原始坐标系, 2 GCJ02 国测局标准/火星坐标系/高德地图使用,3 BD09 百度坐标系/百度地图使用,4 CGCS2000 国家大地坐标系；基础数据-字典表 请求参数 parent = CoordinateType，用户选择后，存入dictCode字段的值）（包含相关的iov_fence_point 围栏点位表的坐标类型）")
    private Integer coordinateType;


    public void setCustomerId(Integer customerId) {
        fencePO.setCustomerId(customerId);
    }


    public void setFenceName(String fenceName) {
        fencePO.setFenceName(fenceName);
    }

    public void setFenceType(Integer fenceType) {
        fencePO.setFenceType(fenceType);
    }

    public void setLength(Double length) {
        fencePO.setLength(length);
    }

    public void setRadius(Double radius) {
        fencePO.setRadius(radius);
    }

    public void setArea(Double area) {
        fencePO.setArea(area);
    }

    public void setCoordinateType(Integer coordinateType) {
        fencePO.setCoordinateType(coordinateType);
    }




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
    private LineOptions lineOptions;

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


    public void setFenceId(Long fenceId) {
        linePO.setFenceId(fenceId);
    }

    public void setLineName(String lineName) {
        linePO.setLineName(lineName);
    }

    public void setRoadLabelId(Long roadLabelId) {
        linePO.setRoadLabelId(roadLabelId);
    }

    public void setCleanLevel(Integer cleanLevel) {
        linePO.setCleanLevel(cleanLevel);
    }

    public void setStartPointName(String startPointName) {
        linePO.setStartPointName(startPointName);
    }

    public void setEndPointName(String endPointName) {
        linePO.setEndPointName(endPointName);
    }

    public void setCommunityCode(Long communityCode) {
        linePO.setCommunityCode(communityCode);
    }

    public void setPurlingCount(Integer purlingCount) {
        linePO.setPurlingCount(purlingCount);
    }

    public void setSweepCount(Integer sweepCount) {
        linePO.setSweepCount(sweepCount);
    }

    public void setDedustCount(Integer dedustCount) {
        linePO.setDedustCount(dedustCount);
    }

    public void setPurlingDirection(Integer purlingDirection) {
        linePO.setPurlingDirection(purlingDirection);
    }

    public void setSweepDirection(Integer sweepDirection) {
        linePO.setSweepDirection(sweepDirection);
    }

    public void setDedustDirection(Integer dedustDirection) {
        linePO.setDedustDirection(dedustDirection);
    }

    public void setLineLength(Double lineLength) {
        linePO.setLineLength(lineLength);
    }

    public void setLineWidth(Double lineWidth) {
        linePO.setLineWidth(lineWidth);
    }

    public void setLineArea(Double lineArea) {
        linePO.setLineArea(lineArea);
    }

    public void setLocationInfo(String locationInfo) {
        linePO.setLocationInfo(locationInfo);
    }

    public LineOptions getLineOptions() {
        return lineOptions;
    }

    public void setLineOptions(LineOptions lineOptions) {
        this.lineOptions = lineOptions;

        if(Objects.nonNull(lineOptions)){
            linePO.setLineOptions(lineOptions.convertToInt());
        }

    }
}
