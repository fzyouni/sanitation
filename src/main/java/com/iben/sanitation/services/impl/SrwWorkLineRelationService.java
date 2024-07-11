package com.iben.sanitation.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iben.sanitation.domain.SrwWorkLineRelationPo;
import com.iben.sanitation.mapper.ISrwWorkLineRelationMapper;
import com.iben.sanitation.services.ISrwWorkLineRelationService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/11 21:17
 */
@Service
public class SrwWorkLineRelationService extends ServiceImpl<ISrwWorkLineRelationMapper, SrwWorkLineRelationPo>
    implements ISrwWorkLineRelationService {

  @Override
  public List<SrwWorkLineRelationPo> getWorkLineRelationPoList() {
    return baseMapper.selectList(new QueryWrapper<>());
  }
}
