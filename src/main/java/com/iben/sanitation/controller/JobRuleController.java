package com.iben.sanitation.controller;

import com.iben.sanitation.services.impl.JobRuleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 作业监督考核接口
 *
 * @author fangzhuo
 * @version 1.0.0
 * @since 2024/07/04 17:58
 */
@RestController
@RequestMapping("sa/rule")
public class JobRuleController {

    @Resource
    JobRuleService jobRuleService;

    /**
     * 考核规则添加
     */
    @PostMapping
    public void addRule() {

    }

    /**
     * 考核规则列表
     */
    @GetMapping
    public void listRule() {

    }

    /**
     * 考核规则详情
     */
    @GetMapping("{ruleId}")
    public void detailRuleById(@PathVariable Integer ruleId) {

    }

    /**
     * 考核规则删除
     */
    @DeleteMapping("{ruleId}")
    public void deleteFence(@PathVariable Integer ruleId) {

    }

    /**
     * 考核记录查询
     */
    @GetMapping("rule_result/{ruleResultId}")
    public void searchRuleRecord(@PathVariable Integer ruleResultId) {

    }

}

