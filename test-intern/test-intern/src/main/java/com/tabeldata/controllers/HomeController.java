package com.tabeldata.controllers;

import com.tabeldata.service.DataService;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    private DataService dataService;

    
    @GetMapping
    public String welcome(Model model){
        model.addAttribute("datas", dataService.findAll());
        return "index";
    }
}
