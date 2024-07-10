package com.iben.sanitation.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.iben.sanitation.domain.base.extend.BaseModel;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

/**
 * line
 * 围栏线路业务表(iov_fence_line)表实体类
 *
 * @author qquan
 * @since 2024-06-24 16:26:54
 */
@TableName("iov_fence_line")
public class IovFenceLinePo extends BaseModel {

    @TableId
    @Schema(description = "围栏线路业务ID")
    private Long lineId;

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
    private BigDecimal lineLength;

    @Schema(description = "线路宽度 单位米double 0.00")
    private BigDecimal lineWidth;

    @Schema(description = "线路面积 单位立方米double 0.00")
    private BigDecimal lineArea;

    @Schema(description = "位置信息")
    private String locationInfo;


    private static final long serialVersionUID = 1L;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getFenceId() {
        return fenceId;
    }

    public void setFenceId(Long fenceId) {
        this.fenceId = fenceId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public Long getRoadLabelId() {
        return roadLabelId;
    }

    public void setRoadLabelId(Long roadLabelId) {
        this.roadLabelId = roadLabelId;
    }

    public Integer getCleanLevel() {
        return cleanLevel;
    }

    public void setCleanLevel(Integer cleanLevel) {
        this.cleanLevel = cleanLevel;
    }

    public String getStartPointName() {
        return startPointName;
    }

    public void setStartPointName(String startPointName) {
        this.startPointName = startPointName;
    }

    public String getEndPointName() {
        return endPointName;
    }

    public void setEndPointName(String endPointName) {
        this.endPointName = endPointName;
    }

    public Long getCommunityCode() {
        return communityCode;
    }

    public void setCommunityCode(Long communityCode) {
        this.communityCode = communityCode;
    }

    public Integer getLineOptions() {
        return lineOptions;
    }

    public void setLineOptions(Integer lineOptions) {
        this.lineOptions = lineOptions;
    }

    public Integer getPurlingCount() {
        return purlingCount;
    }

    public void setPurlingCount(Integer purlingCount) {
        this.purlingCount = purlingCount;
    }

    public Integer getSweepCount() {
        return sweepCount;
    }

    public void setSweepCount(Integer sweepCount) {
        this.sweepCount = sweepCount;
    }

    public Integer getDedustCount() {
        return dedustCount;
    }

    public void setDedustCount(Integer dedustCount) {
        this.dedustCount = dedustCount;
    }

    public Integer getPurlingDirection() {
        return purlingDirection;
    }

    public void setPurlingDirection(Integer purlingDirection) {
        this.purlingDirection = purlingDirection;
    }

    public Integer getSweepDirection() {
        return sweepDirection;
    }

    public void setSweepDirection(Integer sweepDirection) {
        this.sweepDirection = sweepDirection;
    }

    public Integer getDedustDirection() {
        return dedustDirection;
    }

    public void setDedustDirection(Integer dedustDirection) {
        this.dedustDirection = dedustDirection;
    }

    public BigDecimal getLineLength() {
        return lineLength;
    }

    public void setLineLength(BigDecimal lineLength) {
        this.lineLength = lineLength;
    }

    public BigDecimal getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(BigDecimal lineWidth) {
        this.lineWidth = lineWidth;
    }

    public BigDecimal getLineArea() {
        return lineArea;
    }

    public void setLineArea(BigDecimal lineArea) {
        this.lineArea = lineArea;
    }

    public String getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(String locationInfo) {
        this.locationInfo = locationInfo;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lineId=").append(lineId);
        sb.append(", fenceId=").append(fenceId);
        sb.append(", lineName=").append(lineName);
        sb.append(", roadLabelId=").append(roadLabelId);
        sb.append(", cleanLevel=").append(cleanLevel);
        sb.append(", startPointName=").append(startPointName);
        sb.append(", endPointName=").append(endPointName);
        sb.append(", communityCode=").append(communityCode);
        sb.append(", lineOptions=").append(lineOptions);
        sb.append(", purlingCount=").append(purlingCount);
        sb.append(", sweepCount=").append(sweepCount);
        sb.append(", dedustCount=").append(dedustCount);
        sb.append(", purlingDirection=").append(purlingDirection);
        sb.append(", sweepDirection=").append(sweepDirection);
        sb.append(", dedustDirection=").append(dedustDirection);
        sb.append(", lineLength=").append(lineLength);
        sb.append(", lineWidth=").append(lineWidth);
        sb.append(", lineArea=").append(lineArea);
        sb.append(", locationInfo=").append(locationInfo);
        sb.append(", createTime=").append(getCreateTime());
        sb.append(", modifyTime=").append(getModifyTime());
        sb.append(", deleteStatus=").append(getDeleteStatus());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
