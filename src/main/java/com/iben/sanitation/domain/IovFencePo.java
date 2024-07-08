package com.iben.sanitation.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 围栏表
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/07 16:04
 */
@Data
@TableName("iov_fence")
public class IovFencePo {
  /**
   * 主键
   */
  @TableId
  private Integer fenceId;
  /**
   * 部门ID
   */
  private String orgId;
  /**
   * 通用报警方式
   * 0 驶入持续报警
   * 1 偏离持续报警
   * 2 驶入报警一次
   * 3 偏离报警一次
   */
  private Integer alarmWay;
  /**
   * 围栏类型
   * 1 标注
   * 2 多边形
   * 3 线路
   * 4 行政区域
   * 5 矩形
   */
  private Integer fenceType;
  /**
   * 半径
   */
  private BigDecimal radius;
  /**
   * 位置
   */
  private String position;
  /**
   * 区域面积
   */
  private BigDecimal area;
  /**
   * 创建时间
   */
  private Timestamp createTime;
  /**
   * 修改时间
   */
  private Timestamp modifyTime;
}
