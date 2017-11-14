/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.wsdl.Customer;
import com.wsdl.CustomerService_Service;

/**
 *
 * @author user
 */
public class CustomerService {

    public static void createCustomer(Customer customer) {

        CustomerService_Service customerService = new CustomerService_Service();
        com.wsdl.CustomerService customerProxy = customerService.getCustomerServicePort();
        customerProxy.createCustomer(customer);

    }
}
