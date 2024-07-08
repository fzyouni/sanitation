package com.iben.sanitation.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 围栏点位vo
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/08 10:02
 */
@Data
public class IovFencePointVO {

  private Integer fencePointId;
  private Integer orgId;
  private BigDecimal lat;
  private BigDecimal lng;
  private Integer sort;

}
