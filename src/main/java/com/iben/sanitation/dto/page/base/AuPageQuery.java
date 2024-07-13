package com.iben.sanitation.dto.page.base;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
public abstract class AuPageQuery<T> extends MyPageQuery<T>{

    @Getter
    @Setter
    @NotNull(message = "上级客户不能为空")
    @Schema(description = "[必填]上级客户ID 数组",example = "[0]",type = "Array",requiredMode = Schema.RequiredMode.REQUIRED)
    List<Long> customerIdList;


    public AuPageQuery(Long currentPage, Long pageSize) {
        super(currentPage, pageSize);
    }



}
