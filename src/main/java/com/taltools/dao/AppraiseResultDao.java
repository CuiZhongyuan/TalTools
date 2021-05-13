package com.taltools.dao;


import com.taltools.entity.AppraiseResultEntity;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface AppraiseResultDao {
    List<AppraiseResultEntity> getResult(String wo_number);
}
