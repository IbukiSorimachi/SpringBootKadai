package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class kadai1Controller {

    @RequestMapping("/")
    public String start() {
        return "kadai1.html";

    }
}