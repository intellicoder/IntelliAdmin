package com.intelliadmin.intelliadmin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public Object hello() {
        return "Hello IntelliAdmin";
    }
}
