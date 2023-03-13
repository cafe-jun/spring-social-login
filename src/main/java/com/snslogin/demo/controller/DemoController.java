package com.snslogin.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class DemoController {
    @GetMapping("/hello")
    String hello() {
        return "hello-world";
    }
}
