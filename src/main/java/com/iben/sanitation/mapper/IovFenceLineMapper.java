package com.iben.sanitation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iben.sanitation.domain.IovFenceLinePo;
import com.iben.sanitation.domain.IovFencePo;

import java.util.List;

public interface IovFenceLineMapper extends BaseMapper<IovFenceLinePo> {
    int deleteByPrimaryKey(Long lineId);
    IovFenceLinePo selectByPrimaryKey(Long lineId);
    List<IovFenceLinePo> selectAll();
    int updateByPrimaryKey(IovFenceLinePo row);


}
