package com.taltools.dao;

import com.taltools.entity.UserEntity;

import java.util.List;

public interface UserDao {

    int insert(UserEntity record);

    List<UserEntity> selectUsers();
}