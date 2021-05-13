package com.taltools.controller;

import com.taltools.entity.AppraiseResultEntity;
import com.taltools.service.AppraiseResultService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author czy
 */
@SuppressWarnings("ALL")
@RestController
@RequestMapping(value = "/api")
public class AppraiseResultController {

    @Autowired
    private AppraiseResultService appraiseResultService;
    @GetMapping("/getAppraise")
    public List<AppraiseResultEntity> getResult(@Param("wo_number") String wo_number){
        return appraiseResultService.getRsult(wo_number);
    }
}
