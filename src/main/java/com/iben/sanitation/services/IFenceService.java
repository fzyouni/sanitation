package com.iben.sanitation.services;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.iben.sanitation.domain.IovFencePO;
import com.iben.sanitation.dto.IovFenceAddDTO;
import com.iben.sanitation.vo.IovFenceVO;

/**
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/07 16:29
 */
public interface IFenceService extends IService<IovFencePO> {

    IPage<IovFencePO> getIovFenceList(Integer currentPage, Integer pageSize);

    IovFenceVO addFence(IovFenceAddDTO fenceAddDTO) throws Exception;
}
