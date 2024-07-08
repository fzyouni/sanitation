package com.iben.sanitation.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.iben.sanitation.domain.IovFencePo;
import com.iben.sanitation.services.impl.FenceService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class FenceController {

  @Resource
  FenceService fenceService;


  @PostMapping
  public void addFence() {

  }


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
