package com.taltools.service;

import com.taltools.entity.AppraiseResultEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface AppraiseResultService {
    String getAll(String wo_number);

    String appraiseLog(String reqJson);
}
