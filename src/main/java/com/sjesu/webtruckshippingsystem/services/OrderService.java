/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.wsdl.Order;
import com.wsdl.OrderService_Service;
import java.util.List;

/**
 *
 * @author user
 */
public class OrderService {

    public static List<Order> getAllOrders() {
        OrderService_Service orderService = new OrderService_Service();
        com.wsdl.OrderService proxy = orderService.getOrderServicePort();
        return proxy.getOrderList();
    }
}
