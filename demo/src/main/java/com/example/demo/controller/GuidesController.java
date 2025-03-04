
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuidesController {
    @GetMapping("/guides")
    public String sayHello(Model theModel){
        return "travela-demo/guides.html";
    }
}
