package com.iben.sanitation.vo;

import com.iben.sanitation.domain.IovFencePO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * 围栏数据vo
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/08 09:54
 */
@Data
public class IovFenceVO extends IovFencePO {

    @Schema(description = "围栏的点位列表")
    private List<IovFencePointVO> pointList;
}
