package com.iben.sanitation.domain.base;

/**
 * @author qquan
 * @date 2024-07-10 16:47
 */
public interface ILogicDeleteBaseModel extends IBaseModel {

    Boolean getDeleteStatus();

    void setDeleteStatus(Boolean deleteStatus);

}
