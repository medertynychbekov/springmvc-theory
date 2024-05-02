package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/first")
public class FirstController {

    @GetMapping("/get-html")
    public String getMyHtml(){
        return "test";
    }

    @GetMapping("/hello-world")
    public String test(){
        return "helloworld";
    }
}
