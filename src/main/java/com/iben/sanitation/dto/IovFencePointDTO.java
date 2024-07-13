package com.iben.sanitation.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

@Validated
@Data
public class IovFencePointDTO implements Serializable {

    @Schema(description = "经度（小数点后6位）",example = "117.046428",requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Double lng;

    @Schema(description = "纬度（小数点后6位）",example = "31.854320",requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Double lat;

    @Schema(description = "排序值",example = "1",requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Integer sort;

}
