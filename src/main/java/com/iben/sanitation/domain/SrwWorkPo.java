package com.iben.sanitation.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.iben.sanitation.domain.base.extend.TimeBaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 作业实体
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/11 20:18
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("srw_work")
public class SrwWorkPo extends TimeBaseModel {

  @TableId
  private Integer workId;
  /**
   * 所属机构
   */
  private Integer orgId;
  /**
   * 作业名称
   */
  private String workName;
  /**
   * 作业类型
   * 1扫地作业
   * 2洒水作业
   * 3垃圾清扫
   * 4环卫工人
   */
  private String workType;
  /**
   * 关联围栏id
   */
  private Integer fenceId;
  /**
   * 是否启用
   */
  private Boolean enable;
  /**
   * 作业行驶速度限制
   */
  private Integer workMaxSpeed;
  /**
   * 洒水车作业水量差值
   */
  private Double workWaterVolume;
  /**
   * 作业设置开关项
   * bit 1is_check_over_spped
   * bit 2扫地状态
   * bit 3洒水状态
   * bit 4水量监测
   * bit 5:是否监测偏离路线(车辆作业完成度低于90%，并驶离作业路线)
   */
  private Integer workOptions;
  /**
   * 水量限制
   */
  private Integer waterLimit;



}
