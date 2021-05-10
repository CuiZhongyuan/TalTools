package com.taltools.service;

import com.github.pagehelper.PageInfo;
import com.taltools.entity.UserEntity;
import org.springframework.stereotype.Service;

/**
 * @author czy
 */
@Service
public interface UserService {

    int addUser(UserEntity user);

    PageInfo<UserEntity> findAllUser(int pageNum, int pageSize);

}
