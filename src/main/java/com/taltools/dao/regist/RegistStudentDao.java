package com.taltools.dao.regist;

import com.registtools.entity.RegistStudentEntity;
import org.springframework.stereotype.Repository;


@SuppressWarnings("ALL")
@Repository
public interface RegistStudentDao {
    RegistStudentEntity getStudentId(String studentd);
}
