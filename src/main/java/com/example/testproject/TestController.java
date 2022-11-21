package com.example.testproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "113322111";
    }

    @GetMapping("/test")
    public String test() {
        return "dwdw";
    }

}
