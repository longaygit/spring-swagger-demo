package com.example.swagger.demo.DO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class User {
    /**
     * 中文名
     */
    @ApiModelProperty(value="用户名")
    String cnName;
    /**
     * 英文名
     */
    String enName;
    /**
     * 年龄--//在返回中忽略某个字段
     */
    @ApiModelProperty(hidden = true)
    Integer age;


    public User(String name,String ename,Integer age){
        this.cnName=name;
        this.enName=ename;
        this.age=age;
    }
}
