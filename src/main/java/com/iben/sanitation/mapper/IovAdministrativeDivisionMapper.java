package com.iben.sanitation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iben.sanitation.domain.IovAdministrativeDivisionPo;

import java.util.List;

public interface IovAdministrativeDivisionMapper extends BaseMapper<IovAdministrativeDivisionPo> {
    int deleteByPrimaryKey(Integer adId);
    IovAdministrativeDivisionPo selectByPrimaryKey(Integer adId);
    List<IovAdministrativeDivisionPo> selectAll();
    int updateByPrimaryKey(IovAdministrativeDivisionPo row);




}
