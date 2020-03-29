package com.hf.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControll {

    @GetMapping("/hello")
    public  String hello(){
        return  "hello!";
    }

}
