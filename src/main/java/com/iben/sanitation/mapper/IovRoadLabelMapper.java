package com.iben.sanitation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iben.sanitation.domain.IovRoadLabelPO;

import java.util.List;

public interface IovRoadLabelMapper extends BaseMapper<IovRoadLabelPO> {
    int deleteByPrimaryKey(Long roadLabelId);
    IovRoadLabelPO selectByPrimaryKey(Long roadLabelId);
    List<IovRoadLabelPO> selectAll();
    int updateByPrimaryKey(IovRoadLabelPO row);



}
