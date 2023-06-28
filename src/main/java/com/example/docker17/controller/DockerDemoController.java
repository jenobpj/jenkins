package com.example.docker17.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerDemoController {
    @GetMapping("testAPI")
    public String testMethod(){
        return "iam working fine";
    }

}
