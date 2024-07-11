package com.iben.sanitation.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iben.sanitation.domain.SrwWorkPo;

import java.util.List;

/**
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/11 20:36
 */
public interface ISrwWorkService extends IService<SrwWorkPo> {

  /**
   * 获取所有作业信息
   */
  List<SrwWorkPo> getAllWorks();
}
