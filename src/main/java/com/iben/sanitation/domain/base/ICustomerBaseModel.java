package com.iben.sanitation.domain.base;

/**
 * @author qquan
 * @date 2024-07-10 16:47
 */
public interface ICustomerBaseModel extends IBaseModel {

    Integer getCustomerId();

    void setCustomerId(Integer customerId);
}
