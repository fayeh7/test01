package com.hxy.test01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Test01Application {

    public static void main(String[] args) {

        SpringApplication.run(Test01Application.class, args);
        log.info("项目启动success");
    }

}
