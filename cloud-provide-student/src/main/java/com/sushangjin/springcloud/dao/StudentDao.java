package com.sushangjin.springcloud.dao;

import com.sushangjin.springcloud.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentDao {

    Student queryById(@Param("id")Long id);

    List<Student> list();

    void insert(@Param("po")Student po);

    void deleteByKey(@Param("id")Long id);

    void updateByKey(@Param("po")Student po);
}
