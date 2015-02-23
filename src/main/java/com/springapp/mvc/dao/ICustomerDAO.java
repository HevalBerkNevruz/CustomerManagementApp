package com.springapp.mvc.dao;

import com.springapp.mvc.model.Customer;

import java.util.List;

/**
 * Created by heval-Computer on 23.2.2015.
 */
public interface ICustomerDAO {
    public void insertOrUpdateCustomer(Customer customer);
    public void delete(int customerId);
    public Customer getCustomer(int customerId);
    public List<Customer> getCustomerList();
}
