package com.taltools.service.impl;

import com.taltools.entity.TMsgEntity;
import com.taltools.dao.TMsgDao;
import com.taltools.service.TMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TMsgServiceImpl implements TMsgService {

    @Autowired
    private TMsgDao tMsgMapper;
    @Override
    public TMsgEntity findById(Integer id) {
        return tMsgMapper.findById(id);
    }

    @Override
    public TMsgEntity findByMessage(String message) {
        return tMsgMapper.findByMessage(message);
    }

    @Override
    public List<TMsgEntity> findTMessageAll() {
        return tMsgMapper.findTMsgAll();
    }
}
