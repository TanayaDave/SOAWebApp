/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.sjesu.webtruckshippingsystem.domain.Comments;
import com.sjesu.webtruckshippingsystem.domain.Invoice;
import com.sjesu.webtruckshippingsystem.domain.Location;
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
    @WebService(serviceName = "location")
public class LocationService {
        @WebMethod(operationName = "getLocationById")
        public String LocationService(@WebParam(name = "locid") Integer loctid) throws Exception {

            Location location = new Location();
            try {
//            EntityManagerFactory emf=Persistence.createEntityManagerFactory("ITMD566PU");
                EntityManager em = Utility.createEntityManager(); //emf.createEntityManager();
                EntityTransaction trans = em.getTransaction();
                trans.begin();
                location = em.find(Location.class, 1);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return location.toString();

        }
    }

