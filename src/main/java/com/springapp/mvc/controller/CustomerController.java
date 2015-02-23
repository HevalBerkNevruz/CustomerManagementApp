package com.springapp.mvc.controller;

import com.springapp.mvc.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by heval-Computer on 23.2.2015.
 */

@Controller
public class CustomerController {

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ModelAndView employee() {
        return new ModelAndView("customer", "command", new Customer());
    }

    @RequestMapping(value = "/addcustomer", method = RequestMethod.POST)
    public String addEmployee(Customer customer, ModelMap model) {
        model.addAttribute("name", customer.getName());
        model.addAttribute("surname", customer.getSurname());
        model.addAttribute("age", customer.getAge());

        return "result";
    }
}
