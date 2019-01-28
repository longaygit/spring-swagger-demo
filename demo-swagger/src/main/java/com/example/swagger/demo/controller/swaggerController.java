package com.example.swagger.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * by longay 2019.0114
 */
@RestController
@RequestMapping("/api")
@Api(description = "接口样例")
public class swaggerController {

    @GetMapping("/hello")
    @ApiOperation(value = "样例接口hello", notes = "返回hello")
    public String hello(){
        return "hello";
    }
}
