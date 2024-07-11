package com.iben.sanitation.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.iben.sanitation.domain.base.extend.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 作业时刻关联
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/11 20:55
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("srw_work_time_rl")
public class SrwWorkTimeRelationPo extends BaseModel {
  @TableId
  private Integer workTimeId;

  private Integer workId;

  private String beginTime;

  private String endTime;



}
