package com.sushagnjin.springcloud.dao;

import com.sushangjin.springcloud.pojo.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClassesDao {

    Classes queryById(@Param("id")Long id);

    List<Classes> list();

    void insert(@Param("po")Classes po);

    void deleteByKey(@Param("id")Long id);

    void updateByKey(@Param("po")Classes po);
}
