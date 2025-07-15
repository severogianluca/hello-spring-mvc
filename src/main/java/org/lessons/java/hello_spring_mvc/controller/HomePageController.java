package org.lessons.java.hello_spring_mvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @GetMapping("/anagrafe")
    public String anagrafe(@RequestParam String name, Model model) {

        model.addAttribute("cognome", "severo");
        model.addAttribute("codiceFiscale", "SVRGLC94C23H501I");
        model.addAttribute("currentDate", LocalDateTime.now());
        model.addAttribute("name", name);

        return "anagrafe";
    }
    
}
