package com.iben.sanitation.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.iben.sanitation.domain.base.extend.BaseModel;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * administrative
 * 行政区划表(iov_administrative_division)表实体类
 *
 * @author qquan
 * @since 2024-06-24 16:26:54
 */
@TableName("iov_administrative_division")
public class IovAdministrativeDivisionPO extends BaseModel {

    @TableId
    @Schema(description = "行政区划id")
    private Integer adId;

    @Schema(description = "父级行政区划id")
    private Integer pid;

    @Schema(description = "行政区划层级（0 省级，1 市级市，2 县级/区级/县级市，3 镇/街道/社居委）")
    private Integer deep;

    @Schema(description = "简称")
    private String name;

    @Schema(description = "俗名（用户自定义）")
    private String localName;

    @Schema(description = "拼音前缀")
    private String pinyinPrefix;

    @Schema(description = "拼音")
    private String pinyin;

    @Schema(description = "行政区划完整拓展id")
    private String extId;

    @Schema(description = "行政区划完整名称")
    private String extName;

    private static final long serialVersionUID = 1L;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getDeep() {
        return deep;
    }

    public void setDeep(Integer deep) {
        this.deep = deep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getPinyinPrefix() {
        return pinyinPrefix;
    }

    public void setPinyinPrefix(String pinyinPrefix) {
        this.pinyinPrefix = pinyinPrefix;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getExtId() {
        return extId;
    }

    public void setExtId(String extId) {
        this.extId = extId;
    }

    public String getExtName() {
        return extName;
    }

    public void setExtName(String extName) {
        this.extName = extName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adId=").append(adId);
        sb.append(", pid=").append(pid);
        sb.append(", deep=").append(deep);
        sb.append(", name=").append(name);
        sb.append(", localName=").append(localName);
        sb.append(", pinyinPrefix=").append(pinyinPrefix);
        sb.append(", pinyin=").append(pinyin);
        sb.append(", extId=").append(extId);
        sb.append(", extName=").append(extName);
        sb.append(", createTime=").append(getCreateTime());
        sb.append(", modifyTime=").append(getModifyTime());
        sb.append(", deleteStatus=").append(getDeleteStatus());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
