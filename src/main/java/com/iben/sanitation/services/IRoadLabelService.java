package com.iben.sanitation.services;


import com.baomidou.mybatisplus.extension.service.IService;
import com.iben.sanitation.domain.IovRoadLabelPO;
import com.iben.sanitation.queryForm.RoadLabelQueryForm;

import java.util.List;

/**
 * @author qquan
 * @date 2024-07-12 0:13
 */
public interface IRoadLabelService extends IService<IovRoadLabelPO> {

    List<IovRoadLabelPO> queryRoadLabelListByForm(RoadLabelQueryForm queryForm);
}
