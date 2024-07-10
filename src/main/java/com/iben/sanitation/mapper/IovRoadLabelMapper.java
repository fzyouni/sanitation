package com.iben.sanitation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iben.sanitation.domain.IovRoadLabelPo;

import java.util.List;

public interface IovRoadLabelMapper extends BaseMapper<IovRoadLabelPo> {
    int deleteByPrimaryKey(Long roadLabelId);
    IovRoadLabelPo selectByPrimaryKey(Long roadLabelId);
    List<IovRoadLabelPo> selectAll();
    int updateByPrimaryKey(IovRoadLabelPo row);



}
