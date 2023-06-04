package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    获取配置文件里自定义的值,有三种方法
@Value("${name}")//第一种，注意这里的${}名字要与配置文件里的一致
    private String name;

//获取对象的值
    @Value("${person2.name}")//第一种，注意这里的${}名字要与配置文件里的一致
    private String name2;

    @Value("${person2.age}")//第一种，注意这里的${}名字要与配置文件里的一致
    private int age;

//    获取数组的值
    @Value("${address[0]}")
    private String address1;

//    纯量
    @Value("${msp1}")
    private String msp1;

    @Value("${msp2}")
    private String msp2;


//    第二种方法，环境对象
    @Autowired
    private Environment env;

//    第三种方式,ConfigurationProperties
    @Autowired
    private person person;

    @RequestMapping("/hello2")
    public String hello2(){

        System.out.println(name);
        System.out.println(name2);
        System.out.println(age);
        System.out.println(address1);

        System.out.println(msp1);//hello \n world

        System.out.println(msp2);

        System.out.println("-----------------------------------------------");

        //环境对象法
        System.out.println(env.getProperty("address[0]"));

        System.out.println("_______________________________________");

//        第三种方法
        System.out.println(person);

        String[] list=person.getAddress();

        for (String shuzu:list)
        {
            System.out.println(shuzu);
        }


        return "hello springboot2023";
    }



}


