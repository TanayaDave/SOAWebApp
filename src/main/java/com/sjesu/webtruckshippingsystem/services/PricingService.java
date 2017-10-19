/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

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

    @WebMethod(operationName = "getPricingList")
    public List<Pricing> priceService(@WebParam(name = "priceid") Integer prcid) throws Exception {

        PricingService price = new PricingService();
        try {
//            EntityManagerFactory emf=Persistence.createEntityManagerFactory("ITMD566PU");
            EntityManager em = Utility.createEntityManager(); //emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return price.findAllPrice();
    }

    public List<Pricing> findAllPrice() {
        EntityManager em = Utility.createEntityManager();
        return (em.createQuery("Select c from Pricing c", Pricing.class).getResultList());
    }
}
