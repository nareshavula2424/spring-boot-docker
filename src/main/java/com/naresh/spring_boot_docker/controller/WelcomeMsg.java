package com.naresh.spring_boot_docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMsg {
    @GetMapping("/{name}")
    public String getWelcomeMsg(@PathVariable String name){
        String msg = "Hi " +name+ ", Welcome to Docker ";
        return msg;
    }
}
