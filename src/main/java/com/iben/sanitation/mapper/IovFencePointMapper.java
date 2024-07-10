package com.iben.sanitation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iben.sanitation.domain.IovFencePointPO;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

public interface IovFencePointMapper extends BaseMapper<IovFencePointPO> {
    int deleteByPrimaryKey(Long fencePointId);
    IovFencePointPO selectByPrimaryKey(Long fencePointId);
    List<IovFencePointPO> selectAll();
    int updateByPrimaryKey(IovFencePointPO row);


    /**
     * 批量插入 BdmFencePoint
     *
     * 方法的执行前需要检验参数
     * @param points 点位集合 not empty
     * @param fenceId 围栏id not null
     * @param customerId 客户id not null
     * @param coordinateType 坐标系类型 not null
     *  BdmFencePoint  lat lng sort > 0
     */
    void batchInsertPoints(@Param("points") Collection<IovFencePointPO> points,
                           @Param("fenceId") Long fenceId,
                           @Param("customerId") Integer customerId,
                           @Param("coordinateType") Integer coordinateType);


}
