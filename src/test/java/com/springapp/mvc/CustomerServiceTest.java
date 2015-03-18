package com.springapp.mvc;

import com.springapp.mvc.config.MvcConfiguration;
import com.springapp.mvc.model.Customer;
import com.springapp.mvc.service.ICustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

/**
 * Created by heval-Computer on 18.3.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes= MvcConfiguration.class)
public class CustomerServiceTest {

    @Autowired
    ICustomerService service;

    @Test
    public void insertOrUpdate() throws Exception{
        Customer dummyCustomer=this.getDummyCustomer();
        Customer customer=service.insertOrUpdateCustomer(dummyCustomer);
        assertEquals(customer.getId(),dummyCustomer.getId());
        assertEquals(customer.getName(),dummyCustomer.getName());
        assertEquals(customer.getSurname(),dummyCustomer.getSurname());
        assertEquals(customer.getAge(),dummyCustomer.getAge());
        assertEquals(customer.getPassword(),dummyCustomer.getPassword());
    }

    public Customer getDummyCustomer(){
        Customer customer=new Customer();
        customer.setId(1);
        customer.setName("Heval Berk");
        customer.setSurname("Nevruz");
        customer.setAge(20);
        customer.setPassword("123456");
        return customer;
    }
}
