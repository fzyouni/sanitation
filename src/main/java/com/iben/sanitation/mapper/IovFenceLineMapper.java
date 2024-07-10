package com.iben.sanitation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iben.sanitation.domain.IovFenceLinePO;

import java.util.List;

public interface IovFenceLineMapper extends BaseMapper<IovFenceLinePO> {
    int deleteByPrimaryKey(Long lineId);
    IovFenceLinePO selectByPrimaryKey(Long lineId);
    List<IovFenceLinePO> selectAll();
    int updateByPrimaryKey(IovFenceLinePO row);


}
