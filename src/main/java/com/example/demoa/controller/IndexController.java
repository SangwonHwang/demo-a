package com.example.demoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "CodeDeploy로 배포된 Demo A ver2 입니다.";
    }
}
