package com.taltools.service;

import com.taltools.entity.AppraiseResultEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppraiseResultService {
    List<AppraiseResultEntity> getRsult(String wo_number);
}
