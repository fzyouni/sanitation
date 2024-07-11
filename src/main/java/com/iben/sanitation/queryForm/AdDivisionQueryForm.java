package com.iben.sanitation.queryForm;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * @author qquan
 * @date 2024-07-11 23:39
 */
@Data
public class AdDivisionQueryForm implements Serializable {

    @Schema(description = "行政区划id")
    private Integer adId;

    @Schema(description = "根据父级行政区划id具体查询")
    private Integer pid;

    @Schema(description = "根据行政区划层级（0 省级，1 市级市，2 县级/区级/县级市，3 镇/街道/社居委）具体查询")
    private Integer deep;

    @Schema(description = "根据简称 模糊查询")
    private String name;

    @Schema(description = "根据 俗名（用户自定义 label）模糊查询")
    private String localName;


}
