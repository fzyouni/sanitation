package com.iben.sanitation.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iben.sanitation.domain.IovRoadLabelPO;
import com.iben.sanitation.mapper.IovRoadLabelMapper;
import com.iben.sanitation.queryForm.RoadLabelQueryForm;
import com.iben.sanitation.services.IRoadLabelService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author qquan
 * @date 2024-07-12 0:14
 */
@Service
public class RoadLabelService extends ServiceImpl<IovRoadLabelMapper, IovRoadLabelPO> implements IRoadLabelService {

    @Resource
    private IovRoadLabelMapper iovRoadLabelMapper;


    public List<IovRoadLabelPO> queryRoadLabelListByForm(RoadLabelQueryForm queryForm) {

        List<IovRoadLabelPO> resultList = new ArrayList<>();

        if (Objects.isNull(queryForm)) {
            return resultList;
        }


        Integer customerId = queryForm.getCustomerId();

        Long roadLabelId = queryForm.getRoadLabelId();
        String roadLabelName = queryForm.getRoadLabelName();

        boolean customerIdIsNull = Objects.isNull(customerId);
        boolean roadLabelIdIsNull = Objects.isNull(roadLabelId);

        boolean roadLabelNameEmpty = StringUtils.isEmpty(roadLabelName);

        if (customerIdIsNull) {
            // 不传客户ID参数时 返回空数据;
            return resultList;
        }

        LambdaQueryWrapper<IovRoadLabelPO> query = Wrappers.lambdaQuery();

        query.eq(!customerIdIsNull, IovRoadLabelPO::getCustomerId, customerId);
        query.eq(!roadLabelIdIsNull, IovRoadLabelPO::getRoadLabelId, roadLabelId);

        query.like(!roadLabelNameEmpty, IovRoadLabelPO::getRoadLabelName, roadLabelName);

        query.orderBy(true, true, IovRoadLabelPO::getLabelSort);

        resultList = iovRoadLabelMapper.selectList(query);

        return resultList;
    }


}
