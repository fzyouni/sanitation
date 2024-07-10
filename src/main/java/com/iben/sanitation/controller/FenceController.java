package com.iben.sanitation.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.iben.sanitation.domain.IovFencePo;
import com.iben.sanitation.services.impl.FenceService;
import com.iben.sanitation.vo.IovFenceVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

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
    FenceService fenceService;


    @PostMapping
    public void addFence(IovFenceVO iovFenceVO) {
        fenceService.addFence(iovFenceVO);
    }

    @Operation(summary = "获取围栏信息列表")
    @Parameters({
            @Parameter(name = "currentPage", description = "页码", in = ParameterIn.PATH),
            @Parameter(name = "pageSize", description = "页容量", required = true, in = ParameterIn.PATH)
    })
    @GetMapping
    public IPage<IovFencePo> listFence(
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

}
