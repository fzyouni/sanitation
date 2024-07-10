package com.iben.sanitation.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.iben.sanitation.domain.base.extend.CustomerBaseModel;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

/**
 * 围栏点位表(iov_fence_point)表实体类
 *
 * @author qquan
 * @since 2024-06-24 16:26:54
 */
@TableName("iov_fence_point")
public class IovFencePointPo extends CustomerBaseModel {

    @TableId
    @Schema(description = "围栏点位ID")
    private Long fencePointId;

    @Schema(description = "围栏 id")
    private Long fenceId;

    @Schema(description = "经度（小数点后6位）")
    private BigDecimal lng;

    @Schema(description = "纬度（小数点后6位）")
    private BigDecimal lat;

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

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
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
