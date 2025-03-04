package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TourController {
    @GetMapping("/tour")
    public String sayHello(Model theModel){
        return "travela-demo/tour.html";
    }
}
