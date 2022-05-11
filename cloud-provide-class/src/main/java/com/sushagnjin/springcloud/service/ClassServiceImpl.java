package com.sushagnjin.springcloud.service;

import cn.hutool.core.util.RandomUtil;
import com.sushagnjin.springcloud.dao.ClassesDao;
import com.sushangjin.springcloud.pojo.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    ClassesDao classesDao;


    @Override
    public Classes queryById(Long id) {
        return classesDao.queryById(id);
    }

    @Override
    public List<Classes> listclass() {
        return classesDao.list();
    }

    @Override
    public void deleteByKey(Long id) {
        classesDao.deleteByKey(id);
    }

    @Override
    public void addClass(Classes classes) {
        classes.setId(RandomUtil.randomLong(30));
        classesDao.insert(classes);
    }

    @Override
    public void updateClass(Classes classes) throws Exception {
        classesDao.updateByKey(classes);
    }
}
