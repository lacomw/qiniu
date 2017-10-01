package com.qiniu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by tommy.wch on 2017/9/24.
 */
@Controller
@RequestMapping(value = "glove")
public class GloveController {

    @RequestMapping(value = "/")
    public String index(ModelMap modelMap){
        ModelAndView modelAndView = new ModelAndView("home");
        System.out.println("in index");
        modelMap.put("num","123");
        return "glove/glove_list";
    }
}
