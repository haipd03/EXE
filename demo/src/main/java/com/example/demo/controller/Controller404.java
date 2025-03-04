
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller404  {
    @GetMapping("/404")
    public String sayHello(Model theModel){
        return "travela-demo/404.html";
    }
}