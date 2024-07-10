package com.iben.sanitation.dto;

import com.iben.sanitation.domain.IovFenceLinePo;
import com.iben.sanitation.domain.IovFencePo;
import com.iben.sanitation.domain.IovFencePointPo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

public class IovFenceAddDto implements Serializable {


    private IovFencePo fence;

    private IovFenceLinePo line;


    @Getter
    @Setter
    @Schema(description = "围栏的点位列表")
    private List<IovFencePointPo> pointList;

}
