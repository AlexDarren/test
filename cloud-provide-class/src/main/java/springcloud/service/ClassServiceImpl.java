package springcloud.service;

import com.sushangjin.springcloud.pojo.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloud.dao.ClassDao;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    ClassDao classDao;


    @Override
    public Classes queryById(Long id) {
        //todo
        return null;
    }
}
