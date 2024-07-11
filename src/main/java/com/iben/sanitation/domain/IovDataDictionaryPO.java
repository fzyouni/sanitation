package com.iben.sanitation.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.iben.sanitation.domain.base.extend.BaseModel;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * dictionary
 * 字典表(iov_data_dictionary)表实体类
 *
 * @author qquan
 * @since 2024-06-24 16:26:54
 */
@TableName("iov_data_dictionary")
public class IovDataDictionaryPO extends BaseModel {

    @TableId
    @Schema(description = "字典表ID")
    private Long dictId;

    @Schema(description = "对该数据的解释")
    private String remark;

    @Schema(description = "名称")
    private String dictName;

    @Schema(description = "数据code (使用者数据库存的字符串数据值)")
    private String dictCode;

    @Schema(description = "数据code (使用者数据库存的数值类数据值)")
    private Integer intCode;

    @Schema(description = "父类关键字，用于标识一组code")
    private String parent;

    @Schema(description = "排序值，值越小越靠前")
    private Integer dictSort;


    private static final long serialVersionUID = 1L;

    public Long getDictId() {
        return dictId;
    }

    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public Integer getIntCode() {
        return intCode;
    }

    public void setIntCode(Integer intCode) {
        this.intCode = intCode;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Integer getDictSort() {
        return dictSort;
    }

    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dictId=").append(dictId);
        sb.append(", remark=").append(remark);
        sb.append(", dictName=").append(dictName);
        sb.append(", dictCode=").append(dictCode);
        sb.append(", intCode=").append(intCode);
        sb.append(", parent=").append(parent);
        sb.append(", dictSort=").append(dictSort);
        sb.append(", createTime=").append(getCreateTime());
        sb.append(", modifyTime=").append(getModifyTime());
        sb.append(", deleteStatus=").append(getDeleteStatus());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
