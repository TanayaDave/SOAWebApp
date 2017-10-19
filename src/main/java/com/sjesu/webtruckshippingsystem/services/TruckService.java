/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.sjesu.webtruckshippingsystem.domain.Truck;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebService(serviceName = "TruckService")
public class TruckService {

    @WebMethod(operationName = "getTruckDetailsById")
    public String TruckService(@WebParam(name = "id") Integer id) throws Exception {
 

        Truck truck=new Truck();
        try {
//            EntityManagerFactory emf=Persistence.createEntityManagerFactory("ITMD566PU");
            EntityManager em=Utility.createEntityManager(); //emf.createEntityManager();
            EntityTransaction trans=em.getTransaction();
            trans.begin();
            truck=em.find(Truck.class, id);
            trans.commit();
            em.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return truck.toString();

    }
}