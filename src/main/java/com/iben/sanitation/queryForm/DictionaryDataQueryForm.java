package com.iben.sanitation.queryForm;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * @author qquan
 * @date 2024-07-11 23:39
 */
@Data
public class DictionaryDataQueryForm implements Serializable {

    @Schema(description = "根据字典表ID具体查询")
    private Long dictId;

    @Schema(description = "根据名称模糊查询")
    private String dictName;

    @Schema(description = "根据code值具体查询")
    private String dictCode;

    @Schema(description = "根据父类关键字具体查询")
    private String parent;


}
