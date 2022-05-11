package com.sushagnjin.springcloud.service;

import com.sushagnjin.springcloud.dao.ClassesDao;
import com.sushangjin.springcloud.pojo.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    ClassesDao classesDao;


    @Override
    public Classes queryById(Long id) {
        return classesDao.queryById(id);
    }
}
