package com.iben.sanitation.controller;

import com.iben.sanitation.domain.IovAdministrativeDivisionPO;
import com.iben.sanitation.domain.IovDataDictionaryPO;
import com.iben.sanitation.msg.ResponseModel;
import com.iben.sanitation.queryForm.AdDivisionQueryForm;
import com.iben.sanitation.queryForm.DictionaryDataQueryForm;
import com.iben.sanitation.services.IBasicDataService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qquan
 * @date 2024-07-11 23:35
 */

@RestController
@RequestMapping("basicData")
@Tag(name = "基础数据相关")
public class BasicDataController {

    @Resource
    private IBasicDataService basicDataService;

    @Operation(summary = "字典数据查询")
    @PostMapping(value = "/queryDictionary")
    public ResponseModel<List<IovDataDictionaryPO>> queryDictionary(@RequestBody DictionaryDataQueryForm queryForm) throws Exception {
        List<IovDataDictionaryPO> poList = basicDataService.queryAdDivisionListByForm(queryForm);

        return ResponseModel.success(poList);
    }

    @Operation(summary = "行政区划查询")
    @PostMapping(value = "/queryAdDivision")
    public ResponseModel<List<IovAdministrativeDivisionPO>> queryAdDivision(@RequestBody AdDivisionQueryForm queryForm) {
        List<IovAdministrativeDivisionPO> poList = basicDataService.queryAdDivisionListByForm(queryForm);

        return ResponseModel.success(poList);
    }





}
