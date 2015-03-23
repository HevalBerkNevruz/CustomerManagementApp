package com.springapp.mvc.controller;

import com.springapp.mvc.model.Customer;
import com.springapp.mvc.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by heval-Computer on 23.2.2015.
 */

@Controller
public class CustomerController {

    @Autowired
    ICustomerService service;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView customerList(ModelAndView modelAndView) {
        List<Customer> customerList=service.getCustomerList();
        modelAndView.addObject("customerList",customerList);
        modelAndView.setViewName("result");
        return modelAndView;
    }

    @RequestMapping(value="/newcustomer",method = RequestMethod.GET)
    public ModelAndView newCustomer(ModelAndView modelAndView){
        Customer customer=new Customer();
        modelAndView.addObject("customer",customer);
        modelAndView.setViewName("customer");
        return modelAndView;
    }

    @RequestMapping(value = "/savecustomer",method = RequestMethod.POST)
    public ModelAndView addCustomer(@ModelAttribute @Valid Customer customer,BindingResult result){
        if(result.hasErrors()){
            return new ModelAndView("customer");
        }else {
            service.insertOrUpdateCustomer(customer);
            return new ModelAndView("redirect:/");
        }
    }

    @RequestMapping(value= "/deletecustomer",method = RequestMethod.GET)
    public ModelAndView deleteCustomer(@RequestParam("id") int customerId){
        service.deleteCustomer(customerId);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/editcustomer",method = RequestMethod.GET)
    public ModelAndView editCustomer(@RequestParam("id") int customerId){
        Customer customer=service.getCustomer(customerId);
        ModelAndView modelAndView=new ModelAndView("customer");
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }
}