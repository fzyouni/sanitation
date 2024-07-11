package com.iben.sanitation.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iben.sanitation.domain.SrwWorkVehicleRelationPo;
import com.iben.sanitation.mapper.ISrwWorkVehicleRelationMapper;
import com.iben.sanitation.services.ISrwWorkVehicleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/11 21:08
 */
@Service
public class SrwWorkVehicleService extends ServiceImpl<ISrwWorkVehicleRelationMapper, SrwWorkVehicleRelationPo>
    implements ISrwWorkVehicleService {

  @Override
  public List<SrwWorkVehicleRelationPo> getAllWorksVehicleRelation() {
    return baseMapper.selectList(new QueryWrapper<>());
  }

}
