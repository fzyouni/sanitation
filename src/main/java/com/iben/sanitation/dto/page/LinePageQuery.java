package com.iben.sanitation.dto.page;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.iben.sanitation.dto.page.base.AuPageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
public class LinePageQuery<T> extends AuPageQuery<T> {

    // 自定义查询参数

    public LinePageQuery(Long currentPage, Long pageSize) {
        super(currentPage, pageSize);
    }

    @Override
    protected IPage<T> obtainIPage() {
        return super.obtainIPage();
    }

    @Override
    protected Wrapper<T> obtainQueryWrapper() {
        return super.obtainQueryWrapper();
    }
}
