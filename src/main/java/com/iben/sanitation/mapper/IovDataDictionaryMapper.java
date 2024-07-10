package com.iben.sanitation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iben.sanitation.domain.IovDataDictionaryPo;
import com.iben.sanitation.domain.IovFencePo;

import java.util.List;

public interface IovDataDictionaryMapper extends BaseMapper<IovDataDictionaryPo> {
    int deleteByPrimaryKey(Long dictId);
    List<IovDataDictionaryPo> selectAll();
    int updateByPrimaryKey(IovDataDictionaryPo row);



}
