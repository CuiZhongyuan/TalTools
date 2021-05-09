package com.taltools.dao;

import com.taltools.entity.UserDomain;

import java.util.List;

public interface UserDao {

    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}