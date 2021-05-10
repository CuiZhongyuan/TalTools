package com.taltools.service;

import com.taltools.entity.TMsgEntity;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author czy
 */
@Service
public interface TMsgService {

    TMsgEntity findById(Integer id);

    TMsgEntity findByMessage(String message);

    List<TMsgEntity> findTMessageAll();

}
