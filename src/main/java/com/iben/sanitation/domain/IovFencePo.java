package com.iben.sanitation.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.iben.sanitation.domain.base.extend.CustomerBaseModel;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

/**
 * fence
 * 围栏表(iov_fence)表实体类
 *
 * @author qquan
 * @since 2024-06-24 16:26:54
 */
@TableName("iov_fence")
public class IovFencePo extends CustomerBaseModel {

    @TableId
    @Schema(description = "围栏 id")
    private Long fenceId;

    @Schema(description = "围栏名称")
    private String fenceName;

    @Schema(description = "围栏类型 1 标注 2 多边形 3 线路 4 行政区域 5 矩形 6 圆形")
    private Integer fenceType;

    @Schema(description = "线路实际长度（仅限线路，默认值0）")
    private BigDecimal length;

    @Schema(description = "半径（仅限标注/圆形，默认值0）")
    private BigDecimal radius;

    @Schema(description = "区域面积(仅限多边形/矩形/圆形，默认值0)")
    private BigDecimal area;

    @Schema(description = "经纬度坐标系类型 （1 WGS84 - 原始坐标系, 2 GCJ02 国测局标准/火星坐标系/高德地图使用,3 BD09 百度坐标系/百度地图使用,4 CGCS2000 国家大地坐标系；基础数据-字典表 请求参数 parent = CoordinateType，用户选择后，存入dictCode字段的值）（包含相关的iov_fence_point 围栏点位表的坐标类型）")
    private Integer coordinateType;

    private static final long serialVersionUID = 1L;

    public Long getFenceId() {
        return fenceId;
    }

    public void setFenceId(Long fenceId) {
        this.fenceId = fenceId;
    }

    public String getFenceName() {
        return fenceName;
    }

    public void setFenceName(String fenceName) {
        this.fenceName = fenceName;
    }

    public Integer getFenceType() {
        return fenceType;
    }

    public void setFenceType(Integer fenceType) {
        this.fenceType = fenceType;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getRadius() {
        return radius;
    }

    public void setRadius(BigDecimal radius) {
        this.radius = radius;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public Integer getCoordinateType() {
        return coordinateType;
    }

    public void setCoordinateType(Integer coordinateType) {
        this.coordinateType = coordinateType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fenceId=").append(fenceId);
        sb.append(", fenceName=").append(fenceName);
        sb.append(", fenceType=").append(fenceType);
        sb.append(", length=").append(length);
        sb.append(", radius=").append(radius);
        sb.append(", area=").append(area);
        sb.append(", coordinateType=").append(coordinateType);
        sb.append(", customerId=").append(getCustomerId());
        sb.append(", createTime=").append(getCreateTime());
        sb.append(", modifyTime=").append(getModifyTime());
        sb.append(", deleteStatus=").append(getDeleteStatus());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
