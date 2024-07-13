package com.iben.sanitation.dto;

import com.iben.sanitation.domain.IovFenceLinePO;
import com.iben.sanitation.domain.IovFencePO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class IovFenceDTO implements Serializable {

    @Getter
    @Schema(description = "围栏实体类", hidden = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private IovFencePO fencePO;

    @Getter
    @Schema(description = "围栏线路业务实体类", hidden = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private IovFenceLinePO linePO;


    @Getter
    @Setter
    @NotEmpty(message = "点位不能为空")
    @Schema(description = "围栏的点位列表", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<IovFencePointDTO> pointList;

//    public IovFenceAddDto(IovFencePo fencePo, IovFenceLinePo linePo, List<IovFencePointPo> pointList) {
//        this.fencePo = fencePo;
//        this.linePo = linePo;
//        this.pointList = pointList;
//    }

    public IovFenceDTO() {
        this.fencePO = new IovFencePO();
        this.linePO = new IovFenceLinePO();
        this.pointList = new ArrayList<IovFencePointDTO>();
    }


    @NotNull(message = "客户/部门id 不能为空")
    @Schema(description = "部门id（客户）", example = "0", requiredMode = Schema.RequiredMode.REQUIRED, hidden = true)
    private Integer customerId;

    @NotEmpty(message = "围栏名称不能为空")
    @Schema(description = "围栏名称", example = "示例围栏名", requiredMode = Schema.RequiredMode.REQUIRED)
    private String fenceName;

    @Min(value = 1, message = "围栏类型最小值为1")
    @Max(value = 6, message = "围栏类型最大值为6")
    @NotNull(message = "围栏类型不能为空")
    @Schema(description = "围栏类型 1 标注 2 圆形 3 线路 4 矩形 5 多边形 6 行政区域，字典表 " +
            "parent='FenceType'", example = "3", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer fenceType;

    @NotNull(message = "线路实际长度不能为空")
    @Schema(description = "线路实际长度（仅限线路,地图提供的折线长度计算结果）",
            example = "0", requiredMode = Schema.RequiredMode.REQUIRED, hidden = true)
    private Double length;

    @NotNull(message = "半径不能为空")
    @Schema(description = "半径（仅限标注/圆形）,其他情况隐藏", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
    private Double radius;

    @NotNull(message = "区域面积不能为空")
    @Schema(description = "区域面积(仅限多边形/矩形/圆形,其他情况隐藏)", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
    private Double area;

    @NotNull(message = "经纬度坐标系类型不能为空")
    @Schema(description = "经纬度坐标系类型 （1 WGS84 - 原始坐标系, 2 GCJ02 国测局标准/火星坐标系/高德地图使用,3 BD09 百度坐标系/百度地图使用," +
            "4 CGCS2000 国家大地坐标系；基础数据-字典表 请求参数 parent = CoordinateType，用户选择后，存入dictCode字段的值）" +
            "（包含相关的iov_fence_point 围栏点位表的坐标类型）", example = "2", requiredMode = Schema.RequiredMode.REQUIRED, hidden = true)
    private Integer coordinateType;


    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
        fencePO.setCustomerId(customerId);
    }


    public void setFenceName(String fenceName) {
        this.fenceName = fenceName;
        fencePO.setFenceName(fenceName);
    }

    public void setFenceType(Integer fenceType) {
        this.fenceType = fenceType;
        fencePO.setFenceType(fenceType);
    }

    public void setLength(Double length) {
        this.length = length;
        fencePO.setLength(length);
    }

    public void setRadius(Double radius) {
        this.radius = radius;
        fencePO.setRadius(radius);
    }

    public void setArea(Double area) {
        this.area = area;
        fencePO.setArea(area);
    }

    public void setCoordinateType(Integer coordinateType) {
        this.coordinateType = coordinateType;
        fencePO.setCoordinateType(coordinateType);
    }


    @Schema(description = "关联的围栏ID （便于直接获取围栏点位信息或业务）", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long fenceId;

    @NotEmpty(message = "线路名称不能为空")
    @Schema(description = "线路名称 同围栏名称", example = "测试线路名称", requiredMode = Schema.RequiredMode.REQUIRED)
    private String lineName;

    @NotNull(message = "实体路标签不能为空")
    @Schema(description = "实体路标签属性 例如 （芙蓉路(翡翠路-天都路)，芙蓉路（翡翠路-宝塔路））" +
            "(一条line只能属于一条road，选好road后，如果默认保洁等级为空，会设置默认保洁等级，" +
            "路线选项及洒水清扫抑尘躺数和方向和线路宽度，每条line的这些属性都可以自定义),默认列表的第一项", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long roadLabelId;

    @NotNull(message = "保洁等级不能为空")
    @Schema(description = "[必填] 保洁等级 （道路的保洁等级 1 一级，2 二级，3 三级）", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer cleanLevel;

    @Schema(description = "起止位置-开始线路", example = "1", requiredMode = Schema.RequiredMode.AUTO)
    private String startPointName;

    @Schema(description = "起止位置-结束线路", example = "1", requiredMode = Schema.RequiredMode.AUTO)
    private String endPointName;

    @NotNull(message = "所属片区不能为空")
    @Schema(description = "所属片区（行政区划表 iov_administrative_division 请求参数 deep=3,pid = 340125，" +
            "默认第一个，显示localName，存入adId字段的值）", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long communityCode;

    @NotNull(message = "路线选项不能为空")
    @Schema(description = "路线选项", requiredMode = Schema.RequiredMode.REQUIRED)
    private LineOptions lineOptionsOb;

    @Schema(description = "洒水趟数 整数", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer purlingCount;

    @Schema(description = "清扫趟数 整数", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer sweepCount;

    @Schema(description = "抑尘趟数 整数", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer dedustCount;

    @Schema(description = "洒水方向 1 单向 2 双向", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer purlingDirection;

    @Schema(description = "清扫方向 1 单向 2 双向", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer sweepDirection;

    @Schema(description = "抑尘方向 1 单向 2 双向", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer dedustDirection;

    @Schema(description = "线路长度 单位米double 0.00 用户自定义的长度", example = "0", requiredMode = Schema.RequiredMode.AUTO)
    private Double lineLength;

    @Schema(description = "线路宽度 单位米double 0.00 用户自定义的", example = "线路宽度", requiredMode = Schema.RequiredMode.AUTO)
    private Double lineWidth;

    @Schema(description = "线路面积 单位立方米double 0.00 用户自定义的", example = "线路面积", requiredMode = Schema.RequiredMode.AUTO)
    private Double lineArea;

    @Schema(description = "位置信息", example = "位置信息示例 ", requiredMode = Schema.RequiredMode.AUTO)
    private String locationInfo;


    public void setFenceId(Long fenceId) {
        this.fenceId = fenceId;
        linePO.setFenceId(fenceId);
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
        linePO.setLineName(lineName);
    }

    public void setRoadLabelId(Long roadLabelId) {
        this.roadLabelId = roadLabelId;
        linePO.setRoadLabelId(roadLabelId);
    }

    public void setCleanLevel(Integer cleanLevel) {
        this.cleanLevel = cleanLevel;
        linePO.setCleanLevel(cleanLevel);
    }

    public void setStartPointName(String startPointName) {

        this.startPointName = startPointName;
        linePO.setStartPointName(startPointName);
    }

    public void setEndPointName(String endPointName) {
        this.endPointName = endPointName;
        linePO.setEndPointName(endPointName);
    }

    public void setCommunityCode(Long communityCode) {
        this.communityCode = communityCode;
        linePO.setCommunityCode(communityCode);
    }

    public void setPurlingCount(Integer purlingCount) {
        this.purlingCount = purlingCount;
        linePO.setPurlingCount(purlingCount);
    }

    public void setSweepCount(Integer sweepCount) {
        this.sweepCount = sweepCount;
        linePO.setSweepCount(sweepCount);
    }

    public void setDedustCount(Integer dedustCount) {
        this.dedustCount = dedustCount;
        linePO.setDedustCount(dedustCount);
    }

    public void setPurlingDirection(Integer purlingDirection) {
        this.purlingDirection = purlingDirection;
        linePO.setPurlingDirection(purlingDirection);
    }

    public void setSweepDirection(Integer sweepDirection) {
        this.sweepDirection = sweepDirection;
        linePO.setSweepDirection(sweepDirection);
    }

    public void setDedustDirection(Integer dedustDirection) {
        this.dedustDirection = dedustDirection;
        linePO.setDedustDirection(dedustDirection);
    }

    public void setLineLength(Double lineLength) {
        this.lineLength = lineLength;
        linePO.setLineLength(lineLength);
    }

    public void setLineWidth(Double lineWidth) {
        this.lineWidth = lineWidth;
        linePO.setLineWidth(lineWidth);
    }

    public void setLineArea(Double lineArea) {
        this.lineArea = lineArea;
        linePO.setLineArea(lineArea);
    }

    public void setLocationInfo(String locationInfo) {
        this.locationInfo = locationInfo;
        linePO.setLocationInfo(locationInfo);
    }

    public LineOptions getLineOptionsOb() {
        return lineOptionsOb;
    }

    public void setLineOptionsOb(LineOptions lineOptionsOb) {
        this.lineOptionsOb = lineOptionsOb;

        if (Objects.nonNull(lineOptionsOb)) {
            linePO.setLineOptions(lineOptionsOb.convertToInt());
        }

    }
}
