package com.mindsprint.project.service;

import com.mindsprint.project.dao.CustomerDAO;
import com.mindsprint.project.dao.CustomerDaoImpl;
import com.mindsprint.project.models.Customer;

import java.util.List;

public class CustomerService {
    private CustomerDAO dao; //ref of dao
    public CustomerService(){
        dao = new CustomerDaoImpl(); //pass impl object to interface
    }

    public Customer addNewCustomer(Customer customer) {
        return dao.addNewCustomer(customer);

    }

    public List<Customer> getAllCustomers(){
        return dao.getAllCustomers();
    }
}
