package com.taltools.dao.course;

import com.registtools.entity.PushMessageEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PushMessageDao {
    List<PushMessageEntity> getCountClasses(Map<String,Object> map);
}
