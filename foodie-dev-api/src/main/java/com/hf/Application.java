package com.hf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hf.mapper")
@ComponentScan(basePackages = {"com.hf","org.n3r.idworker"})
public class Application {

    public static void main(String [] arg){
        SpringApplication.run(Application.class,arg);
    }
}
