package com.iben.sanitation.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iben.sanitation.domain.SrwWorkPo;
import com.iben.sanitation.mapper.ISrwWorkMapper;
import com.iben.sanitation.services.ISrwWorkService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/11 20:37
 */
@Service
public class SrwWorkService extends ServiceImpl<ISrwWorkMapper, SrwWorkPo> implements ISrwWorkService {


  @Override
  public List<SrwWorkPo> getAllWorks() {
    return baseMapper.selectList(new QueryWrapper<>());
  }
}
