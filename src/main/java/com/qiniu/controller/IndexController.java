package com.qiniu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lacomw on 2017/10/7.
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping("/printhello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/")
    public String index(ModelMap modelMap){
        ModelAndView modelAndView = new ModelAndView("home");
        System.out.println("in index");
        modelMap.put("num","123");
//        return "home";
        return "index";
    }
}
