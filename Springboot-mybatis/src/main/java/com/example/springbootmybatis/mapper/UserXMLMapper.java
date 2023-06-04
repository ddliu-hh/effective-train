package com.example.springbootmybatis.mapper;


import com.example.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserXMLMapper {

//    在这里没有写注解，那就意味着要写xml文件进行映射
    public List<User> findAll();
}
