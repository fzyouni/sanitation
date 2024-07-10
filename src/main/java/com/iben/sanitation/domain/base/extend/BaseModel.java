package com.iben.sanitation.domain.base.extend;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.iben.sanitation.domain.base.ILogicDeleteBaseModel;
import com.iben.sanitation.domain.base.ITimeBaseModel;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;


/**
 * 带时间和逻辑删除的数据
 *
 * @author qquan
 * @date 2024-07-10 16:48
 */
public abstract class BaseModel implements ILogicDeleteBaseModel, ITimeBaseModel {


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Schema(description = "创建时间")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Schema(description = "修改时间")
    private Date modifyTime;

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @Schema(description = "删除状态 (0->未删除；1->已删除)")
    private Boolean deleteStatus;


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

    @Override
    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    @Override
    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }


}
