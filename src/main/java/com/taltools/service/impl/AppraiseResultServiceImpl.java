package com.taltools.service.impl;

import com.taltools.dao.AppraiseResultDao;
import com.taltools.entity.AppraiseResultEntity;
import com.taltools.service.AppraiseResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@SuppressWarnings("ALL")
@Service
public class AppraiseResultServiceImpl implements AppraiseResultService {
    @Autowired
    private  AppraiseResultDao appraiseResultDao;

    @Override
    public List<AppraiseResultEntity> getRsult(String wo_number) {
        return appraiseResultDao.getResult(wo_number);
    }
}
