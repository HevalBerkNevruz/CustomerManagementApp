package com.springapp.mvc.service;

import com.springapp.mvc.dao.ICustomerDAO;
import com.springapp.mvc.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by heval-Computer on 16.3.2015.
 */

/* Sadece commit edilmiş verilerin okunması için */
@Transactional(timeout = 20,isolation = Isolation.READ_COMMITTED)
@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerDAO dao;

    @Override
    public Customer insertOrUpdateCustomer(Customer customer) {
        dao.insertOrUpdateCustomer(customer);
        return customer;
    }

    @Override
    public void deleteCustomer(int id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Customer> getCustomerList() {
        List<Customer> customerList=dao.getCustomerList();
        return customerList;
    }

    @Transactional(readOnly = true )
    @Override
    public Customer getCustomer(int id) {
        Customer customer=dao.getCustomer(id);
        return customer;
    }
}
