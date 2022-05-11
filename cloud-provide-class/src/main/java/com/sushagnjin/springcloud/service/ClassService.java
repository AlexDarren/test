package com.sushagnjin.springcloud.service;

import com.sushangjin.springcloud.pojo.Classes;

import java.util.List;

public interface ClassService {
    Classes queryById(Long id);

    List<Classes> listclass();

    void deleteByKey(Long id);

    void addClass(Classes classes);

    void updateClass(Classes classes) throws Exception;
}
