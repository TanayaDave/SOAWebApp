/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.sjesu.webtruckshippingsystem.domain.Employee;
import com.sjesu.webtruckshippingsystem.domain.Order;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebService(serviceName = "OrderService")
public class OrderService {

    @WebMethod(operationName = "getOrderDetailsById")
    public String OrderService(@WebParam(name = "orderId") Integer id) throws Exception {
 

        Order order=new Order();
        try {
//            EntityManagerFactory emf=Persistence.createEntityManagerFactory("ITMD566PU");
            EntityManager em=Utility.createEntityManager(); //emf.createEntityManager();
            EntityTransaction trans=em.getTransaction();
            trans.begin();
            order=em.find(Order.class, id);
            trans.commit();
            em.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order.toString();

    }
     @WebMethod
    public List<Order> getOrderList() {
        EntityManager em = Utility.createEntityManager(); //emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();

        return (em.createQuery("Select c from OrderTable c", Order.class).getResultList());

    }
}