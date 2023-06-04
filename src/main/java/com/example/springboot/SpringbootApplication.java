package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

//    SpringBoot是基于约定的，所以很多配置都有默认值，但如果想使用自己的配置替换默认配首的话，就可以使用
//          application.properties或者application.yml(application.yaml)进行配置。注意，文件的名称是固定的，不允许改变

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
