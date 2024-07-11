package com.iben.sanitation.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.iben.sanitation.domain.base.extend.BaseModel;
import com.iben.sanitation.domain.base.extend.CustomerBaseModel;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * road
 * 道路标签表(iov_road_label)表实体类
 *
 * @author qquan
 * @since 2024-06-24 16:26:54
 */
@TableName("iov_road_label")
public class IovRoadLabelPO extends CustomerBaseModel {

    @TableId
    @Schema(description = "围栏线路归属的道路标签ID")
    private Long roadLabelId;

    @Schema(description = "围栏线路归属的道路标签，道路名称，可重复 （例如 繁华大道）")
    private String roadLabelName;

    @Schema(description = "标签的层级（默认 10）")
    private Integer labelDeep;

    @Schema(description = "标签之间的排序值")
    private Integer labelSort;

    @Schema(description = "开始位置（例如 天都路）")
    private String startPointName;

    @Schema(description = "结束位置（例如 习友路）")
    private String endPointName;

    @Schema(description = "备注信息 ")
    private String remark;

    @Schema(description = "所属片区（行政区划表 iov_administrative_division 请求参数 deep=3,pid = 340125，默认第一个，显示localName，存入adId字段的值）")
    private Long communityCode;

    @Schema(description = "[必填] 保洁等级 （道路的保洁等级 1 一级，2 二级，3 三级）")
    private Integer cleanLevel;

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
    private Double roadLength;

    @Schema(description = "线路宽度 单位米double 0.00")
    private Double roadWidth;

    @Schema(description = "线路面积 单位立方米double 0.00")
    private Double roadArea;


    private static final long serialVersionUID = 1L;

    public Long getRoadLabelId() {
        return roadLabelId;
    }

    public void setRoadLabelId(Long roadLabelId) {
        this.roadLabelId = roadLabelId;
    }

    public String getRoadLabelName() {
        return roadLabelName;
    }

    public void setRoadLabelName(String roadLabelName) {
        this.roadLabelName = roadLabelName;
    }

    public Integer getLabelDeep() {
        return labelDeep;
    }

    public void setLabelDeep(Integer labelDeep) {
        this.labelDeep = labelDeep;
    }

    public Integer getLabelSort() {
        return labelSort;
    }

    public void setLabelSort(Integer labelSort) {
        this.labelSort = labelSort;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCommunityCode() {
        return communityCode;
    }

    public void setCommunityCode(Long communityCode) {
        this.communityCode = communityCode;
    }

    public Integer getCleanLevel() {
        return cleanLevel;
    }

    public void setCleanLevel(Integer cleanLevel) {
        this.cleanLevel = cleanLevel;
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

    public Double getRoadLength() {
        return roadLength;
    }

    public void setRoadLength(Double roadLength) {
        this.roadLength = roadLength;
    }

    public Double getRoadWidth() {
        return roadWidth;
    }

    public void setRoadWidth(Double roadWidth) {
        this.roadWidth = roadWidth;
    }

    public Double getRoadArea() {
        return roadArea;
    }

    public void setRoadArea(Double roadArea) {
        this.roadArea = roadArea;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roadLabelId=").append(roadLabelId);
        sb.append(", roadLabelName=").append(roadLabelName);
        sb.append(", labelDeep=").append(labelDeep);
        sb.append(", labelSort=").append(labelSort);
        sb.append(", startPointName=").append(startPointName);
        sb.append(", endPointName=").append(endPointName);
        sb.append(", remark=").append(remark);
        sb.append(", communityCode=").append(communityCode);
        sb.append(", cleanLevel=").append(cleanLevel);
        sb.append(", lineOptions=").append(lineOptions);
        sb.append(", purlingCount=").append(purlingCount);
        sb.append(", sweepCount=").append(sweepCount);
        sb.append(", dedustCount=").append(dedustCount);
        sb.append(", purlingDirection=").append(purlingDirection);
        sb.append(", sweepDirection=").append(sweepDirection);
        sb.append(", dedustDirection=").append(dedustDirection);
        sb.append(", roadLength=").append(roadLength);
        sb.append(", roadWidth=").append(roadWidth);
        sb.append(", roadArea=").append(roadArea);
        sb.append(", createTime=").append(getCreateTime());
        sb.append(", modifyTime=").append(getModifyTime());
        sb.append(", deleteStatus=").append(getDeleteStatus());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
