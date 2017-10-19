/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.sjesu.webtruckshippingsystem.domain.Expense;
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
@WebService(serviceName = "ExpenseService")
public class ExpenseService {

    @WebMethod(operationName = "getExpenseDetailsById")
    public String ExpenseService(@WebParam(name = "expId") Integer id) throws Exception {
 

        Expense expense=new Expense();
        try {
//            EntityManagerFactory emf=Persistence.createEntityManagerFactory("ITMD566PU");
            EntityManager em=Utility.createEntityManager(); //emf.createEntityManager();
            EntityTransaction trans=em.getTransaction();
            trans.begin();
            expense=em.find(Expense.class, id);
            trans.commit();
            em.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return expense.toString();

    }
}