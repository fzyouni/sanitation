package com.iben.sanitation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iben.sanitation.domain.IovFencePo;
import com.iben.sanitation.domain.IovFencePointPo;

import java.util.List;

public interface IovFencePointMapper extends BaseMapper<IovFencePointPo> {
    int deleteByPrimaryKey(Long fencePointId);
    IovFencePointPo selectByPrimaryKey(Long fencePointId);
    List<IovFencePointPo> selectAll();
    int updateByPrimaryKey(IovFencePointPo row);



}
