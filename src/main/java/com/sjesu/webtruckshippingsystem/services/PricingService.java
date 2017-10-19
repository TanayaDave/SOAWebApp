/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.sjesu.webtruckshippingsystem.domain.Employee;
import com.sjesu.webtruckshippingsystem.domain.Pricing;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

     *
     * @author shrikantjesu
 */
@WebService(serviceName = "price")
public class PricingService {

    @WebMethod(operationName = "getPriceById")
    public String priceService(@WebParam(name = "priceid") Integer prcid) throws Exception {

        Pricing price = new Pricing();
        try {
//            EntityManagerFactory emf=Persistence.createEntityManagerFactory("ITMD566PU");
            EntityManager em = Utility.createEntityManager(); //emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            price = em.find(Pricing.class, 1);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return price.toString();

    }

    @WebMethod
    public List<Pricing> getPricing() {
        EntityManager em = Utility.createEntityManager(); //emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();

        return (em.createQuery("Select c from Pricing c", Pricing.class).getResultList());

    }
}
