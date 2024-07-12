package com.iben.sanitation.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iben.sanitation.domain.IovFenceLinePO;
import com.iben.sanitation.domain.IovFencePO;
import com.iben.sanitation.domain.IovFencePointPO;
import com.iben.sanitation.dto.IovFenceDTO;
import com.iben.sanitation.mapper.IovFenceLineMapper;
import com.iben.sanitation.mapper.IovFenceMapper;
import com.iben.sanitation.mapper.IovFencePointMapper;
import com.iben.sanitation.services.IFenceService;
import com.iben.sanitation.vo.IovFencePointVO;
import com.iben.sanitation.vo.IovFenceLineVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

/**
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/05 11:21
 */
@Service
public class FenceService extends ServiceImpl<IovFenceMapper, IovFencePO> implements IFenceService {

    @Resource
    IovFenceMapper iovFenceMapper;

    @Resource
    IovFenceLineMapper iovFenceLineMapper;

    @Resource
    IovFencePointMapper iovFencePointMapper;


    @Override
    public IPage<IovFencePO> getIovFenceList(Integer currentPage, Integer pageSize) {
        IPage<IovFencePO> page = new Page<>(currentPage, pageSize);
        return baseMapper.selectPage(page, new QueryWrapper<>());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public IovFenceLineVO addFence(IovFenceDTO fenceAddDTO){
        //TODO
        //check param

        IovFencePO fencePo = fenceAddDTO.getFencePO();

        IovFenceLinePO linePo = fenceAddDTO.getLinePO();

        List<IovFencePointPO> pointList = fenceAddDTO.getPointList();

        int insertResult = iovFenceMapper.insert(fencePo);

        IovFenceLineVO fenceVO = new IovFenceLineVO();

        if (insertResult <= 0) {
            return fenceVO;
        }

        Long fenceId = fencePo.getFenceId();

        fencePo.setFenceId(fenceId);
        int fenceLineResult = iovFenceLineMapper.insert(linePo);

        Integer customerId = fencePo.getCustomerId();
        Integer coordinateType = fencePo.getCoordinateType();

        iovFencePointMapper.batchInsertPoints(pointList, fenceId, customerId, coordinateType);


        BeanUtils.copyProperties(fencePo, fenceVO);

        List<IovFencePointVO> pointVOList = pointList.stream().map(item -> {
            IovFencePointVO pointVO = new IovFencePointVO();
            BeanUtils.copyProperties(item, pointVO);
            return pointVO;
        }).collect(Collectors.toList());
        fenceVO.setPointList(pointVOList);

        return fenceVO;
    }
}
