package com.example.myproject.service;

import com.example.myproject.dao.UserEntityMapper;
import com.example.myproject.dao.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserEntityMapper userEntityMapper;

    // 构造函数
    public UserService(UserEntityMapper userEntityMapper) {
        this.userEntityMapper = userEntityMapper;
    }

    public int addUserInfo(UserEntity userEntity) throws Exception {
        // 实现添加用户的逻辑
        // 可以调用UserEntityMapper中的方法来操作数据库
        return userEntityMapper.insert(userEntity);
    }

    public int modifyUserInfo(UserEntity userEntity) throws Exception {
        // 实现修改用户信息的逻辑
        // 可以调用UserEntityMapper中的方法来操作数据库
        return userEntityMapper.updateByPrimaryKeySelective(userEntity);
    }

    public int deleteUserById(UserEntity userEntity) throws Exception {
        // 实现删除用户的逻辑
        // 可以调用UserEntityMapper中的方法来操作数据库
        return userEntityMapper.deleteUserById(userEntity);
    }

    public List<UserEntity> queryUserList(UserEntity userEntity) throws Exception {
        // 实现查询用户列表的逻辑
        // 可以调用UserEntityMapper中的方法来操作数据库
        List<UserEntity> result=userEntityMapper.queryUserList(userEntity);

        return result;
    }


    public List<UserEntity> selectUserInfo(UserEntity userEntity) throws Exception {
        // 实现查询用户列表的逻辑
        // 可以调用UserEntityMapper中的方法来操作数据库
        List<UserEntity> result=userEntityMapper.queryUserList(userEntity);

        return result;
    }


}
