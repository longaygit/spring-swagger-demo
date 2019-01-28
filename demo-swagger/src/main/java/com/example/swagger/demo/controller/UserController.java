package com.example.swagger.demo.controller;

import com.example.swagger.demo.DO.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
import static org.springframework.util.MimeTypeUtils.TEXT_XML_VALUE;

/**
 * @author longay
 * @create 2019.0114
 **/
@RestController
@RequestMapping(value = "/user", produces = APPLICATION_JSON_VALUE)//配置返回值application/json
@Api(description = "用户管理")
public class UserController {
        ArrayList<User> users = new ArrayList<>();

        @ApiOperation(value = "获取用户列表", notes = "获取所有用户信息")
        @RequestMapping(value = {""}, method = RequestMethod.GET)
        public List<User> hello() {
            users.add(new User("用户1", "name1",20));
            users.add(new User("用户2", "name2",21));
            return users;
        }
        @ApiOperation(value = "输出用户年龄",notes="返回年龄")
        @PostMapping(value="/age",produces = TEXT_XML_VALUE)
         public String getAge(User user){

            String res=user.getCnName()+" age is 20";
            return res;
        }
    @ApiOperation(value = "输出用户",notes="返回用户")
    @PostMapping(value="/singleUser")
    public User getUser(User user){

        return user;
    }
}
