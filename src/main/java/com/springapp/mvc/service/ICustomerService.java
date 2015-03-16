package com.springapp.mvc.service;

import com.springapp.mvc.model.Customer;

import java.util.List;

/**
 * Created by heval-Computer on 16.3.2015.
 */
public interface ICustomerService {
    public void insertOrUpdateCustomer(Customer customer);
    public void deleteCustomer(int id);
    public List<Customer> getCustomerList();
    public Customer getCustomer(int id);
}
