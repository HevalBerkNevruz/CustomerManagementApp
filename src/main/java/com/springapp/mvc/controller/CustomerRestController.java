package com.springapp.mvc.controller;

import com.springapp.mvc.model.Customer;
import com.springapp.mvc.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by heval-Computer on 18.3.2015.
 */
@RestController
@RequestMapping(value = "/rest")
public class CustomerRestController {

    @Autowired
    ICustomerService service;

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Customer getCustomer(@PathVariable int id){
        Customer customer=service.getCustomer(id);
        return customer;
    }

    @RequestMapping(value = "customer/list", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<Customer> getCustomerList(){
        List<Customer> customerList=service.getCustomerList();
        return customerList;
    }

}
