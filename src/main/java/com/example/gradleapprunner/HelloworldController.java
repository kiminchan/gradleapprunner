package com.example.gradleapprunner;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @RequestMapping("/")
    public String index(){
        String s = "Hello World";
        return s;
    }
}
