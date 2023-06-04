package com.example.myproject.controller;

import beans.HttpResponseEntity;
import com.example.myproject.dao.UserEntityMapper;
import com.example.myproject.dao.entity.UserEntity;
import com.example.myproject.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class UserController {

    private UserService userService;

    // 构造函数
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(value = "/userLogin",method = RequestMethod.POST,headers = "Accept=application/json")
    public HttpResponseEntity userLogin(@RequestBody UserEntity userEntity)
    {
        HttpResponseEntity httpResponseEntity=new HttpResponseEntity();

        try {
            List<UserEntity> hasUser=userService.queryUserList(userEntity);
            httpResponseEntity.setCode("100");
            httpResponseEntity.setData(hasUser);
            httpResponseEntity.setMessage("登录成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return httpResponseEntity;
    }


    @RequestMapping(value = "/addUserInfo",method = RequestMethod.POST,headers = "Accept=application/json")
    public HttpResponseEntity addUserInfo(@RequestBody UserEntity userEntity)
    {
        HttpResponseEntity httpResponseEntity=new HttpResponseEntity();

        try {
            int result=userService.addUserInfo(userEntity);
            httpResponseEntity.setCode("100");
            httpResponseEntity.setData(result);
            httpResponseEntity.setMessage("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return httpResponseEntity;
    }


    @RequestMapping(value = "/modifyUserInfo",method = RequestMethod.POST,headers = "Accept=application/json")
    public HttpResponseEntity modifyUserInfo(@RequestBody UserEntity userEntity)
    {
        HttpResponseEntity httpResponseEntity=new HttpResponseEntity();

        try {
            int result=userService.modifyUserInfo(userEntity);
            httpResponseEntity.setCode("100");
            httpResponseEntity.setData(result);
            httpResponseEntity.setMessage("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return httpResponseEntity;
    }



    @RequestMapping(value = "/deleteUserById",method = RequestMethod.POST,headers = "Accept=application/json")
    public HttpResponseEntity deleteUserById(@RequestBody UserEntity userEntity)
    {
        HttpResponseEntity httpResponseEntity=new HttpResponseEntity();

        try {
            int result=userService.deleteUserById(userEntity);
            httpResponseEntity.setCode("100");
            httpResponseEntity.setData(result);
            httpResponseEntity.setMessage("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return httpResponseEntity;
    }





}
