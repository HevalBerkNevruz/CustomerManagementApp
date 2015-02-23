package com.springapp.mvc.dao;

import com.springapp.mvc.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by heval-Computer on 23.2.2015.
 */

public class CustomerDAOImpl implements ICustomerDAO {

    private JdbcTemplate jdbcTemplate;

    public CustomerDAOImpl(DataSource dataSource){
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    public void insertOrUpdateCustomer(Customer customer) {

    }

    @Override
    public void delete(int customerId) {

    }

    @Override
    public Customer getCustomer(int customerId) {
        return null;
    }

    @Override
    public List<Customer> getCustomerList() {
        return null;
    }
}
