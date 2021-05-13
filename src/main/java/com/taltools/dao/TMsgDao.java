package com.taltools.dao;

import com.taltools.entity.TMsgEntity;

import java.util.List;

public interface TMsgDao {
     TMsgEntity findById(Integer id);
     TMsgEntity findByMessage(String message);
     List<TMsgEntity> findTMsgAll();
}
