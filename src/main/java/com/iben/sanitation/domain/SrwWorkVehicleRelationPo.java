package com.iben.sanitation.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.iben.sanitation.domain.base.extend.TimeBaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 作业和车辆关联表
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/10 22:31
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("srw_work_vehicle_rl")
public class SrwWorkVehicleRelationPo extends TimeBaseModel {

  @TableId
  private Integer workVehicleId;

  private Integer vehicleId;

  private Integer workId;
}
