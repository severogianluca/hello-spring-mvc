package org.lessons.java.hello_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomePageController {


    
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
