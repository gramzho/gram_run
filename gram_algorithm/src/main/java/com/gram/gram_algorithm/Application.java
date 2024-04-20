package com.gram.gram_algorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @PostConstruct
    private void test() {
        String str = "test01";
        System.out.println("测试方法：{}");

    }
}
