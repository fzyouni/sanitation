package com.iben.sanitation.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iben.sanitation.domain.IovFencePo;
import com.iben.sanitation.services.IFenceService;
import com.iben.sanitation.vo.IovFenceVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/05 11:21
 */
@Service
public class FenceService extends ServiceImpl<IovFenceMapper, IovFencePo> implements IFenceService {

    @Resource
    IovFenceMapper iovFenceMapper;
    @Resource
    IovFencePointMapper iovFencePointMapper;


    @Override
    public IPage<IovFencePo> getIovFenceList(Integer currentPage, Integer pageSize) {
        IPage<IovFencePo> page = new Page<>(currentPage, pageSize);
        return baseMapper.selectPage(page, new QueryWrapper<>());
    }

    @Override
    public void addFence(IovFenceVO iovFenceVO) {

    }
}
