package com.iben.sanitation.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 围栏点位
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/08 10:08
 */
@Data
@TableName("iov_fence_point")
public class IovFencePointPo {

  @TableId
  private Integer fencePointId;
  private Integer fenceId;
  private Integer orgId;
  private BigDecimal lat;
  private BigDecimal lng;
  private Integer sort;
  private Timestamp createTime;
  private Timestamp modifyTime;
}
