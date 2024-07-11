package com.iben.sanitation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iben.sanitation.domain.IovAdministrativeDivisionPO;

import java.util.List;

public interface IovAdministrativeDivisionMapper extends BaseMapper<IovAdministrativeDivisionPO> {
    int deleteByPrimaryKey(Integer adId);
    IovAdministrativeDivisionPO selectByPrimaryKey(Integer adId);
    List<IovAdministrativeDivisionPO> selectAll();
    int updateByPrimaryKey(IovAdministrativeDivisionPO row);




}
