package com.iben.sanitation.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.iben.sanitation.domain.IovAdministrativeDivisionPO;
import com.iben.sanitation.domain.IovFencePO;
import com.iben.sanitation.domain.IovRoadLabelPO;
import com.iben.sanitation.dto.IovFenceAddDTO;
import com.iben.sanitation.msg.ResponseModel;
import com.iben.sanitation.queryForm.AdDivisionQueryForm;
import com.iben.sanitation.queryForm.RoadLabelQueryForm;
import com.iben.sanitation.services.impl.FenceService;
import com.iben.sanitation.services.impl.RoadLabelService;
import com.iben.sanitation.vo.IovFenceVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 围栏接口
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/04 17:57
 */
@RestController
@RequestMapping("fence")
@Tag(name = "围栏相关接口")
public class FenceController {

    @Resource
    private FenceService fenceService;

    @Resource
    private RoadLabelService roadLabelService;

    @Operation(summary = "添加围栏")
    @PostMapping
    public ResponseModel<IovFenceVO> addFence(@RequestBody IovFenceAddDTO fenceAddDto) throws Exception {
        IovFenceVO fenceVO = fenceService.addFence(fenceAddDto);

        return ResponseModel.success(fenceVO);
    }

    @Operation(summary = "获取围栏信息列表")
    @Parameters({
            @Parameter(name = "currentPage", description = "页码", in = ParameterIn.PATH),
            @Parameter(name = "pageSize", description = "页容量", required = true, in = ParameterIn.PATH)
    })
    @GetMapping
    public IPage<IovFencePO> listFence(
            @Min(value = 1, message = "最小页数为1") @NotNull(message = "当前页不可为空") Integer currentPage,
            @NotNull(message = "页容量不可为空！") @Min(value = 1, message = "最小页容量需大于或等于1！") Integer pageSize) {
        return fenceService.getIovFenceList(currentPage, pageSize);
    }

    @GetMapping("{fenceId}")
    public void detailFence(@PathVariable Integer fenceId) {

    }

    @DeleteMapping("{fenceId}")
    public void deleteFence(@PathVariable Integer fenceId) {

    }



    @Operation(summary = "行政区划查询")
    @PostMapping(value = "/queryAdDivision")
    public ResponseModel<List<IovRoadLabelPO>> queryAdDivision(@RequestBody RoadLabelQueryForm queryForm) {
        List<IovRoadLabelPO> poList = roadLabelService.queryRoadLabelListByForm(queryForm);

        return ResponseModel.success(poList);
    }

}
