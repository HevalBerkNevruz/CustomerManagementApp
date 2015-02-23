package com.springapp.mvc.controller;

import com.springapp.mvc.dao.ICustomerDAO;
import com.springapp.mvc.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by heval-Computer on 23.2.2015.
 */

@Controller
public class CustomerController {

    @Autowired
    ICustomerDAO dao;

    @RequestMapping(value = "/")
    public ModelAndView customerList(ModelAndView modelAndView) {
        List<Customer> customerList=dao.getCustomerList();
        modelAndView.addObject("customerList",customerList);
        modelAndView.setViewName("result");
        return modelAndView;
    }
}
