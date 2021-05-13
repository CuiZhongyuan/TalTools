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
    private TMsgDao tMsgDao;
    @Override
    public TMsgEntity findById(Integer id) {
        return tMsgDao.findById(id);
    }

    @Override
    public TMsgEntity findByMessage(String message) {
        return tMsgDao.findByMessage(message);
    }

    @Override
    public List<TMsgEntity> findTMessageAll() {
        return tMsgDao.findTMsgAll();
    }
}
