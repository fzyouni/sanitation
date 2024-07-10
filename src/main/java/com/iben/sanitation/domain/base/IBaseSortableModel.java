package com.iben.sanitation.domain.base;

public interface IBaseSortableModel extends IBaseModel {

    /**
     * 获取优先级
     *
     * @return
     */
    Integer getPriority();

    /**
     * 设置优先级
     *
     * @param priority
     */
    void setPriority(Integer priority);

}
