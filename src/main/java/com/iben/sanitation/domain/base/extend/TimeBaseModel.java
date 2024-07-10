package com.iben.sanitation.domain.base.extend;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.iben.sanitation.domain.base.ITimeBaseModel;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

/**
 * @author qquan
 * @date 2024-07-10 17:04
 */
public abstract class TimeBaseModel implements ITimeBaseModel {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Schema(description = "创建时间")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Schema(description = "修改时间")
    private Date modifyTime;


    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public Date getModifyTime() {
        return modifyTime;
    }

    @Override
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }


}
