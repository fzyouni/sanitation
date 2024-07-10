package com.iben.sanitation.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 围栏数据vo
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/08 09:54
 */
@Data
public class IovFenceVO {
    /**
     * 所属客户
     */
    private Integer orgId;
    /**
     * 线路名称
     */
    private String roadName;
    /**
     * 保洁等级
     */
    private Integer cleanGrade;
    /**
     * 所属片区
     */
    private Integer zone;

    private Integer alarmWay;
    private Integer fenceType;
    private BigDecimal radius;
    private String position;
    /**
     * 路线面积
     */
    private BigDecimal area;
    private List<IovFencePointVO> pointList;
}
