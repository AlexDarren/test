package com.sushangjin.springcloud.service;

import com.sushangjin.springcloud.dao.StudentDao;
import com.sushangjin.springcloud.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentDao studentDao;


    @Override
    public Student queryById(Long id) {
        return studentDao.queryById(id);
    }
}
