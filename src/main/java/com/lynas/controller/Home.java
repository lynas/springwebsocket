package com.lynas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    @RequestMapping("/")
    public String home() {

        return "page1";
    }

    @RequestMapping("/page1")
    public String page1() {

        return "page1.jsp";
    }
}
