package com.sudin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ranji on 3/1/2017.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/")
    public String home(){
        return "home";
    }
}
