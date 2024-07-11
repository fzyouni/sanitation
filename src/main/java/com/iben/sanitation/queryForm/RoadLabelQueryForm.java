package com.iben.sanitation.queryForm;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * @author qquan
 * @date 2024-07-11 23:39
 */
@Data
public class RoadLabelQueryForm implements Serializable {

    /**
     * 限制属于第几包 哪家环卫公司的道路
     */
    @Schema(description = "根据 部门id（客户）具体查询")
    private Integer customerId;

    @Schema(description = "根据 围栏线路归属的道路标签ID 具体查询")
    private Long roadLabelId;

    @Schema(description = " 根据围栏线路归属的道路标签，道路名称，可重复 （例如 繁华大道） 模糊查询")
    private String roadLabelName;




}
