package com.ay.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class AyTestController {

    @GetMapping("/sayHello")
    public String sayHello(Model model){
        return "hello";
    }
}
