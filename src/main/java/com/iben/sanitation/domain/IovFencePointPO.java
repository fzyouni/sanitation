package com.iben.sanitation.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.iben.sanitation.domain.base.extend.CustomerBaseModel;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 围栏点位表(iov_fence_point)表实体类
 *
 * @author qquan
 * @since 2024-06-24 16:26:54
 */
@TableName("iov_fence_point")
public class IovFencePointPO extends CustomerBaseModel {

    @TableId
    @Schema(description = "围栏点位ID")
    private Long fencePointId;

    @Schema(description = "围栏 id")
    private Long fenceId;

    @Schema(description = "经度（小数点后6位）")
    private Double lng;

    @Schema(description = "纬度（小数点后6位）")
    private Double lat;

    @Schema(description = "经纬度坐标系类型 （1 WGS84 - 原始坐标系, 2 GCJ02 国测局标准/火星坐标系/高德地图使用,3 BD09 百度坐标系/百度地图使用,4 CGCS2000 国家大地坐标系；基础数据-字典表 请求参数 parent = CoordinateType，用户选择后，存入dictCode字段的值）（包含相关的iov_fence_point 围栏点位表的坐标类型）")
    private Integer coordinateType;

    @Schema(description = "顺序")
    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Long getFencePointId() {
        return fencePointId;
    }

    public void setFencePointId(Long fencePointId) {
        this.fencePointId = fencePointId;
    }

    public Long getFenceId() {
        return fenceId;
    }

    public void setFenceId(Long fenceId) {
        this.fenceId = fenceId;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Integer getCoordinateType() {
        return coordinateType;
    }

    public void setCoordinateType(Integer coordinateType) {
        this.coordinateType = coordinateType;
    }


    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fencePointId=").append(fencePointId);
        sb.append(", fenceId=").append(fenceId);
        sb.append(", lng=").append(lng);
        sb.append(", lat=").append(lat);
        sb.append(", coordinateType=").append(coordinateType);
        sb.append(", sort=").append(sort);
        sb.append(", customerId=").append(getCustomerId());
        sb.append(", createTime=").append(getCreateTime());
        sb.append(", modifyTime=").append(getModifyTime());
        sb.append(", deleteStatus=").append(getDeleteStatus());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
