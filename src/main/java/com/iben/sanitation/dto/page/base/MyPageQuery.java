package com.iben.sanitation.dto.page.base;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * 接收参数时
 *  接收分页参数
 *  获取mp分页类
 *  获取查询参数包装类
 * 接收mybatis返回数据时
 * @param <T>
 */
@Validated
public abstract class MyPageQuery<T> implements Serializable {

    private IPage<T> mpPage;

    private Wrapper<T> queryWrapper;

    protected List<T> resultList;
    protected Long totalSize;
    protected Long pageSize;

    protected Long currentPage;

//    protected List<OrderItem> orders;
//    protected boolean optimizeCountSql;
//    protected boolean searchCount;
//    protected boolean optimizeJoinOfCountSql;
//    protected Long maxLimit;
//    protected String countId;

//    public MyPageQuery() {
//        super();
//        this.resultList = super.getRecords();
//        this.totalSize = super.getTotal();
//        this.pageSize = super.getSize();
//        this.currentPage = super.getCurrent();
//    }

    public MyPageQuery(Long currentPage, Long pageSize) {
        this(currentPage, pageSize, 0L);
    }

    public MyPageQuery(Long currentPage, Long pageSize, long total) {
        this(currentPage, pageSize, total, true);
    }

    public MyPageQuery(Long currentPage, Long pageSize, boolean searchCount) {
        this(currentPage, pageSize, 0L, searchCount);
    }

    /**
     * 初始化时，设置默认值
     * @param currentPage
     * @param pageSize
     * @param totalSize
     * @param searchCount
     */
    public MyPageQuery(Long currentPage, Long pageSize, long totalSize, boolean searchCount) {
        IPage<T> page = new Page<>(currentPage,pageSize,totalSize,searchCount);

        this.resultList = Collections.emptyList();
        this.totalSize = 0L;
        this.pageSize = 10L;
        this.currentPage = 1L;


        page.setRecords(resultList);
        page.setTotal(totalSize);
        page.setSize(pageSize);
        page.setCurrent(currentPage);


    }
    protected IPage<T> obtainIPage() {
        return null;
    }

    protected Wrapper<T> obtainQueryWrapper() {
        return null;
    }


}
