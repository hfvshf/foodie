package com.hf.service;

import com.hf.pojo.Stu;

public interface StuService {

    public Stu catStuById(Integer id);

    public void saveStu(Stu stu);

    public void  updateStu(Integer id, Stu stu);

    public void delStu(Integer id);
}
