package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by heval-Computer on 6.3.2015.
 */

@Controller
public class LoginController {

    @RequestMapping(value="/login",method = RequestMethod.GET)
    public ModelAndView isLogin(ModelAndView modelAndView){
        modelAndView.setViewName("login");
        return modelAndView;
    }
}
