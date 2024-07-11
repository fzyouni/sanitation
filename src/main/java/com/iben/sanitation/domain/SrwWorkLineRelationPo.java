package com.iben.sanitation.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.iben.sanitation.domain.base.extend.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 作业线路关系
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/11 20:46
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("srw_work_line_rl")
public class SrwWorkLineRelationPo extends BaseModel {

  @TableId
  private Integer workLineId;

  private Integer workId;

  private Integer lineId;



}
