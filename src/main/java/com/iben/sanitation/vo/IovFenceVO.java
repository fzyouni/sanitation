package com.iben.sanitation.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 围栏数据vo
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/08 09:54
 */
@Data
public class IovFenceVO {

  private Integer fenceId;
  private Integer orgId;
  private Integer alarmWay;
  private Integer fenceType;
  private BigDecimal radius;
  private String position;
  private BigDecimal area;


}
