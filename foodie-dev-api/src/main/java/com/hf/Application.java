package com.hf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hf.mapper")
public class Application {

    public static void main(String [] arg){
        SpringApplication.run(Application.class,arg);
    }
}
