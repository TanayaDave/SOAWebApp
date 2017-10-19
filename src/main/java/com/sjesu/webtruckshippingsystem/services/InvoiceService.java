/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;


import com.sjesu.webtruckshippingsystem.domain.Invoice;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author shrikantjesu
 */
@WebService(serviceName = "InvoiceService")
public class InvoiceService {

    @WebMethod(operationName = "getInvoiceDetailsById")
    public String InvoiceService(@WebParam(name = "invoiceId") Integer empId) throws Exception {
 
        Invoice invoice=new Invoice();
        try {
//            EntityManagerFactory emf=Persistence.createEntityManagerFactory("ITMD566PU");
            EntityManager em=Utility.createEntityManager(); //emf.createEntityManager();
            EntityTransaction trans=em.getTransaction();
            trans.begin();
            invoice=em.find(Invoice.class, 1);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return invoice.toString();

    }
}
