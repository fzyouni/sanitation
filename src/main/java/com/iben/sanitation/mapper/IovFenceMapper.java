package com.iben.sanitation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iben.sanitation.domain.IovFencePo;

import java.util.List;

public interface IovFenceMapper extends BaseMapper<IovFencePo> {
    int deleteByPrimaryKey(Long fenceId);
    List<IovFencePo> selectAll();
    int updateByPrimaryKey(IovFencePo row);




}
