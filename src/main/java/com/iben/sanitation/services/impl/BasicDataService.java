package com.iben.sanitation.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.iben.sanitation.domain.IovAdministrativeDivisionPO;
import com.iben.sanitation.domain.IovDataDictionaryPO;
import com.iben.sanitation.mapper.IovAdministrativeDivisionMapper;
import com.iben.sanitation.mapper.IovDataDictionaryMapper;
import com.iben.sanitation.queryForm.AdDivisionQueryForm;
import com.iben.sanitation.queryForm.DictionaryDataQueryForm;
import com.iben.sanitation.services.IBasicDataService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 基础数据服务
 * @author qquan
 * @date 2024-07-11 23:43
 */
@Service("basicDataService")
public class BasicDataService implements IBasicDataService {


    @Resource
    private IovDataDictionaryMapper iovDataDictionaryMapper;

    @Resource
    private IovAdministrativeDivisionMapper iovAdministrativeDivisionMapper;




    @Override
    public List<IovDataDictionaryPO> queryAdDivisionListByForm(DictionaryDataQueryForm queryForm) {

        List<IovDataDictionaryPO> resultList = new ArrayList<>();

        if (Objects.isNull(queryForm)) {
            return resultList;
        }

        String parent = queryForm.getParent();
        Long dictId = queryForm.getDictId();
        String dictCode = queryForm.getDictCode();
        String dictName = queryForm.getDictName();

        boolean parentEmpty = StringUtils.isEmpty(parent);

        boolean dictIdIsNull = Objects.isNull(dictId);
        boolean dictCodeEmpty = StringUtils.isEmpty(dictCode);
        boolean dictNameEmpty = StringUtils.isEmpty(dictName);
        if (parentEmpty && dictIdIsNull && dictCodeEmpty && dictNameEmpty) {
            //不传参数时 返回空数据;
            return resultList;
        }

        LambdaQueryWrapper<IovDataDictionaryPO> query = Wrappers.lambdaQuery();

        query.eq(!parentEmpty, IovDataDictionaryPO::getParent, parent);
        query.eq(!dictIdIsNull, IovDataDictionaryPO::getDictId, dictId);
        query.eq(!dictCodeEmpty, IovDataDictionaryPO::getDictCode, dictCode);
        query.like(!dictNameEmpty, IovDataDictionaryPO::getDictName, dictName);

        query.orderBy(true,true,IovDataDictionaryPO::getDictSort);

        resultList = iovDataDictionaryMapper.selectList(query);

        return resultList;
    }

    @Override
    public List<IovAdministrativeDivisionPO> queryAdDivisionListByForm(AdDivisionQueryForm queryForm) {

        List<IovAdministrativeDivisionPO> resultList = new ArrayList<>();

        if (Objects.isNull(queryForm)) {
            return resultList;
        }


        Integer adId = queryForm.getAdId();
        Integer pid = queryForm.getPid();
        Integer deep = queryForm.getDeep();
        String name = queryForm.getName();
        String localName = queryForm.getLocalName();

        boolean adIdIsNull = Objects.isNull(adId);
        boolean pidIsNull = Objects.isNull(pid);
        boolean deepIsNull = Objects.isNull(deep);

        boolean nameEmpty = StringUtils.isEmpty(name);
        boolean localNameEmpty = StringUtils.isEmpty(localName);

        if (adIdIsNull && pidIsNull && deepIsNull && nameEmpty&& localNameEmpty) {
            //不传参数时 返回空数据;
            return resultList;
        }

        LambdaQueryWrapper<IovAdministrativeDivisionPO> query = Wrappers.lambdaQuery();

        query.eq(!adIdIsNull, IovAdministrativeDivisionPO::getAdId, adId);
        query.eq(!pidIsNull, IovAdministrativeDivisionPO::getPid, pid);
        query.eq(!deepIsNull, IovAdministrativeDivisionPO::getDeep, deep);
        query.like(!nameEmpty, IovAdministrativeDivisionPO::getName, name);
        query.like(!localNameEmpty, IovAdministrativeDivisionPO::getLocalName, localName);

        query.orderBy(true,true,IovAdministrativeDivisionPO::getExtId);

        resultList = iovAdministrativeDivisionMapper.selectList(query);

        return resultList;
    }




}
