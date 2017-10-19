/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.sjesu.webtruckshippingsystem.domain.Comments;
import com.sjesu.webtruckshippingsystem.domain.Employee;
import com.sjesu.webtruckshippingsystem.domain.Invoice;
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
    @WebService(serviceName = "employee")
public class EmployeeService {
        @WebMethod(operationName = "getEmployeeById")
        public String CommentsService(@WebParam(name = "id") Integer empid) throws Exception {

            Employee emp = new Employee();
            try {
//            EntityManagerFactory emf=Persistence.createEntityManagerFactory("ITMD566PU");
                EntityManager em = Utility.createEntityManager(); //emf.createEntityManager();
                EntityTransaction trans = em.getTransaction();
                trans.begin();
                emp = em.find(Employee.class, 1);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return emp.toString();

        }
    }

