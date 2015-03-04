package com.springapp.mvc.controller;

import com.springapp.mvc.dao.ICustomerDAO;
import com.springapp.mvc.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by heval-Computer on 23.2.2015.
 */

@Controller
public class CustomerController {

    @Autowired
    ICustomerDAO dao;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView customerList(ModelAndView modelAndView) {
        List<Customer> customerList=dao.getCustomerList();
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
    public ModelAndView addCustomer(@ModelAttribute Customer customer){
        dao.insertOrUpdateCustomer(customer);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value= "/deletecustomer",method = RequestMethod.GET)
    public ModelAndView deleteCustomer(HttpServletRequest request){
        int customerId=Integer.parseInt(request.getParameter("id"));
        dao.delete(customerId);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/editcustomer",method = RequestMethod.GET)
    public ModelAndView editCustomer(HttpServletRequest request){
        int customerId=Integer.parseInt(request.getParameter("id"));
        Customer customer=dao.getCustomer(customerId);
        ModelAndView modelAndView=new ModelAndView("customer");
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }
}
