package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

//    注解开发,使用注解开发就不用写mybatis的xml文件了，这是一种方式
@Select("select * from t_user")
    public List<User> findAll();
}
