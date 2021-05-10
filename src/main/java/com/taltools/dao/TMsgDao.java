package com.taltools.dao;

import com.taltools.entity.TMsgEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TMsgDao {
     TMsgEntity findById(Integer id);
     TMsgEntity findByMessage(String message);
     List<TMsgEntity> findTMsgAll();
}
