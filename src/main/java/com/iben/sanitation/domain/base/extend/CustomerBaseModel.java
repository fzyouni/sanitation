package com.iben.sanitation.domain.base.extend;

import com.iben.sanitation.domain.base.ICustomerBaseModel;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 带权限限制的数据
 *
 * @author qquan
 * @date 2024-07-10 16:48
 */
public abstract class CustomerBaseModel extends BaseModel implements ICustomerBaseModel {

    @Schema(description = "部门id（客户）")
    private Integer customerId;

    @Override
    public Integer getCustomerId() {
        return customerId;
    }

    @Override
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

}
