package com.iben.sanitation.domain.base.extend;

import com.iben.sanitation.domain.base.IBaseSortableModel;

public abstract class BaseSortableModel extends BaseModel implements IBaseSortableModel {

    private static final long serialVersionUID = 3927683215672164271L;

    /**
     * 优先级
     */
    private Integer priority;

    @Override
    public Integer getPriority() {
        if (priority == null) {
            priority = 0;
        }
        return priority;
    }

    @Override
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
