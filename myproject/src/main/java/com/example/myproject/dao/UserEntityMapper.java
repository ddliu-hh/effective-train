package com.example.myproject.dao;

import com.example.myproject.dao.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface UserEntityMapper {

    List<UserEntity> queryUserList(UserEntity userEntity) throws Exception;

    int insert(UserEntity userEntity) throws Exception;

    int deleteUserById(UserEntity userEntity) throws Exception;

    int updateByPrimaryKeySelective(UserEntity userEntity) throws Exception;

    public List<UserEntity> selectUserInfo(UserEntity userEntity) throws Exception;


}

