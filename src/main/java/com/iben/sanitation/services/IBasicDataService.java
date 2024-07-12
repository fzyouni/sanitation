package com.iben.sanitation.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iben.sanitation.domain.IovAdministrativeDivisionPO;
import com.iben.sanitation.domain.IovDataDictionaryPO;
import com.iben.sanitation.domain.IovFencePO;
import com.iben.sanitation.domain.IovRoadLabelPO;
import com.iben.sanitation.queryForm.AdDivisionQueryForm;
import com.iben.sanitation.queryForm.DictionaryDataQueryForm;

import java.util.List;

/**
 * @author qquan
 * @date 2024-07-11 23:43
 */
public interface IBasicDataService extends IService<IovFencePO> {
    List<IovDataDictionaryPO> queryAdDivisionListByForm(DictionaryDataQueryForm queryForm);

    List<IovAdministrativeDivisionPO> queryAdDivisionListByForm(AdDivisionQueryForm queryForm);
}
