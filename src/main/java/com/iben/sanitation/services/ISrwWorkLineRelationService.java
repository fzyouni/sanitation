package com.iben.sanitation.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iben.sanitation.domain.SrwWorkLineRelationPo;

import java.util.List;

/**
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/11 21:16
 */
public interface ISrwWorkLineRelationService extends IService<SrwWorkLineRelationPo> {

  List<SrwWorkLineRelationPo> getWorkLineRelationPoList();

}
