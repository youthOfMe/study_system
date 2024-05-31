package com.fenghuaxueyue.subject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 刷题微服务启动类
 */
@SpringBootApplication
@ComponentScan("com.fenghuaxueyue")
@MapperScan("com.fenghuaxueyue.**.mapper")
public class SubjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubjectApplication.class);
    }
}
