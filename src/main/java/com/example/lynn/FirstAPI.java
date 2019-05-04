package com.example.lynn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAPI {
    @RequestMapping("/helloAPI")
    public  String helloAPI(){
        return "hello";
    }
}
