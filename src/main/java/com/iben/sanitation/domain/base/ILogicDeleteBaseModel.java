package com.iben.sanitation.domain.base;

/**
 * @author qquan
 * @date 2024-07-10 16:47
 */
public interface ILogicDeleteBaseModel extends IBaseModel {

    Short getDeleteStatus();

    void setDeleteStatus(Short deleteStatus);

}
