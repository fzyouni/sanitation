package com.iben.sanitation.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.iben.sanitation.domain.IovFencePO;
import com.iben.sanitation.domain.IovRoadLabelPO;
import com.iben.sanitation.dto.IovFenceDTO;
import com.iben.sanitation.enums.ReturnCodeType;
import com.iben.sanitation.exception.BusinessException;
import com.iben.sanitation.msg.ResponseModel;
import com.iben.sanitation.queryForm.RoadLabelQueryForm;
import com.iben.sanitation.services.IFenceService;
import com.iben.sanitation.services.IRoadLabelService;
import com.iben.sanitation.vo.IovFenceLineVO;
import com.iben.sanitation.vo.IovFenceVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
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
    private IFenceService fenceService;

    @Resource
    private IRoadLabelService roadLabelService;

    @Operation(summary = "添加围栏")
    @PostMapping
    public ResponseModel<IovFenceLineVO> addFence(@RequestBody @Valid IovFenceDTO fenceAddDto){
        IovFenceLineVO fenceVO = fenceService.addFence(fenceAddDto);

        return ResponseModel.success(fenceVO);
    }

    @Operation(summary = "获取围栏详情")
    @GetMapping("{fenceId}")
    public void detailFence(@PathVariable Integer fenceId) throws BusinessException {
        throw new BusinessException(ReturnCodeType.PARAMETER_VALIDATE_ERROR,"这是我的自定义异常");
    }

    @DeleteMapping("{fenceId}")
    public void deleteFence(@PathVariable Integer fenceId) {

    }



    @Operation(summary = "查询道路标签信息")
    @PostMapping(value = "/queryRoadLabel")
    public ResponseModel<List<IovRoadLabelPO>> queryRoadLabel(@RequestBody RoadLabelQueryForm queryForm) {
        List<IovRoadLabelPO> poList = roadLabelService.queryRoadLabelListByForm(queryForm);

        return ResponseModel.success(poList);
    }

//    /**
//     * 在表中管理线路业务相关的属性
//     * @param currentPage
//     * @param pageSize
//     * @return
//     */
//    @Operation(summary = "获取线路列表")
//    @GetMapping
//    public IPage<IovFenceVo> listFence(
//            @Min(value = 1, message = "最小页数为1") @NotNull(message = "当前页不可为空") Integer currentPage,
//            @NotNull(message = "页容量不可为空！") @Min(value = 1, message = "最小页容量需大于或等于1！") Integer pageSize) {
//        return fenceService.getIovFenceList(currentPage, pageSize);
//    }

}
