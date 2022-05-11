package com.sushangjin.springcloud.service;

import cn.hutool.core.util.RandomUtil;
import com.sushangjin.springcloud.dao.StudentDao;
import com.sushangjin.springcloud.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentDao studentDao;


    @Override
    public Student queryById(Long id) {
        return studentDao.queryById(id);
    }

    @Override
    public List<Student> listStudent() {
        return studentDao.list();
    }

    @Override
    public void deleteByKey(Long id) {
        studentDao.deleteByKey(id);
    }

    @Override
    public void addStudent(Student student) {
        student.setId(RandomUtil.randomLong(30));
        studentDao.insert(student);
    }

    @Override
    public void updateSutdent(Student student) throws Exception {
        if (student.getId() == null){
            throw new Exception("id不能为空");
        }
        studentDao.updateByKey(student);
    }
}
