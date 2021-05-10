package com.taltools.controller;

import com.taltools.entity.TMsgEntity;
import com.taltools.service.TMsgService;
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
@RequestMapping(value = "/tmsg")
public class TMsgController {

    @Autowired
    private TMsgService tMsgService;

    @GetMapping("/getId")
    public Integer getId(@Param("id") Integer id){
        TMsgEntity tMsgEntity = tMsgService.findById(id);
        return tMsgEntity.getId();
    }

    @GetMapping("/getMsg")
    public String getMsg(@Param("message") String message){
        TMsgEntity tMsgEntity = tMsgService.findByMessage(message);
        return tMsgEntity.getMessage();
    }

    @GetMapping("/getTMsAll")
    public String getTMsAll(){
        List<TMsgEntity> tMsgEntity = tMsgService.findTMessageAll();
        return tMsgEntity.toString();
    }
}
