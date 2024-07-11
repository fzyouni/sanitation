package com.iben.sanitation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iben.sanitation.domain.IovDataDictionaryPO;

import java.util.List;

public interface IovDataDictionaryMapper extends BaseMapper<IovDataDictionaryPO> {
    int deleteByPrimaryKey(Long dictId);
    List<IovDataDictionaryPO> selectAll();
    int updateByPrimaryKey(IovDataDictionaryPO row);



}
