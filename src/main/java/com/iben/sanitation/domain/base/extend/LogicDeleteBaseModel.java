package com.iben.sanitation.domain.base.extend;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.iben.sanitation.domain.base.ILogicDeleteBaseModel;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @author qquan
 * @date 2024-07-10 17:02
 */
public abstract class LogicDeleteBaseModel implements ILogicDeleteBaseModel {

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @Schema(description = "删除状态 (0->未删除；1->已删除)")
    private Boolean deleteStatus;


    @Override
    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    @Override
    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}
