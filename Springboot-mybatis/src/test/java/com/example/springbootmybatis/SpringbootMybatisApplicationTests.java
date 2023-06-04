package com.example.springbootmybatis;

import com.example.springbootmybatis.domain.User;
import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.mapper.UserXMLMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserXMLMapper userXMLMapper;

//    注解开发测试
    @Test
    public void testFindAll(){
        List<User> list=userMapper.findAll();
        System.out.println(list);
    }


//    映射文件方式测试
    @Test
    public void testFindAll2(){
        List<User> list=userXMLMapper.findAll();
        System.out.println(list);
    }



}
