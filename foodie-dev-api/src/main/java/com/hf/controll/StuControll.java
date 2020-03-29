package com.hf.controll;

import com.hf.pojo.Stu;
import com.hf.service.StuService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuControll {

    @Autowired
    private StuService stuService;

    @RequestMapping("/CatStu")
    public Stu catStu(Integer  id){

        return stuService.catStuById(id);
    }
}
