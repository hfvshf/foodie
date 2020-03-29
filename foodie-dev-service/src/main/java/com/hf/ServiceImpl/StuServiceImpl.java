package com.hf.ServiceImpl;

import com.hf.mapper.StuMapper;
import com.hf.pojo.Stu;
import com.hf.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StuServiceImpl implements StuService {

    @Autowired
    StuMapper stuMapper;

    @Override
    public Stu catStuById(Integer id) {

        Stu stu = stuMapper.selectByPrimaryKey(id);

        return stu;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveStu(Stu stu) {

    }

    @Override
    public void updateStu(Integer id, Stu stu) {

    }

    @Override
    public void delStu(Integer id) {

    }
}
