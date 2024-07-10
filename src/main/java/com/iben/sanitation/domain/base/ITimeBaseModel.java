package com.iben.sanitation.domain.base;

import java.util.Date;

/**
 * @author qquan
 * @date 2024-07-10 16:47
 */
public interface ITimeBaseModel extends IBaseModel {

    Date getCreateTime();

    void setCreateTime(Date createTime);

    Date getModifyTime();

    void setModifyTime(Date modifyTime);

}
