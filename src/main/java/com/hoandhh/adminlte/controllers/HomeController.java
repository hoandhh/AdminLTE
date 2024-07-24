package com.hoandhh.adminlte.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class HomeController {

    @GetMapping
    public String index() {
        return "redirect:/admin/";
    }

    @RequestMapping("/")
    public String home() {
        return "home";
    }
}
