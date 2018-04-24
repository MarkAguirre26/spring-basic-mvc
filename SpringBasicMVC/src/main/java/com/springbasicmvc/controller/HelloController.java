package com.springbasicmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView mymethod() {
        ModelAndView v = new ModelAndView();
        v.setViewName("hellopage");
        v.addObject("msg", "Hellow First Spring MVC");
        return v;
    }

}
