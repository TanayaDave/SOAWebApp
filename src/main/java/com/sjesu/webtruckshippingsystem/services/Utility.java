/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.sjesu.webtruckshippingsystem.domain.User;
import com.wsdl.Address;
import com.wsdl.ContactDetails;
import com.wsdl.Employee;
import com.wsdl.EmployeeService_Service;
import com.wsdl.Exception_Exception;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author shrikantjesu
 */
public class Utility {

    public static EntityManager createEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ITMD566PU");
        EntityManager em = emf.createEntityManager();
        return em;
    }

    public static void testWsdl() {
        EmployeeService_Service emp = new EmployeeService_Service();
        com.wsdl.EmployeeService proxy = emp.getEmployeeServicePort();
        Employee empobj = proxy.getEmployeeById(1);
        LOG.info("Data:" + empobj.getEmpFirstName());
        empobj.setEmpFirstName("Sjesucheck");
        try {
            proxy.createEmployee(empobj);
        } catch (Exception_Exception ex) {
            Logger.getLogger(Utility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateEmployee() {
        try {
            
            EmployeeService_Service emp = new EmployeeService_Service();
            com.wsdl.EmployeeService proxy = emp.getEmployeeServicePort();
            Employee empobj = proxy.getEmployeeById(1);
            Address addr = new Address();
            ContactDetails contact = new ContactDetails();
            LOG.info("Data:" + empobj.getId());
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(new Date());
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

            addr.setAddressLine1("500");
            addr.setAddressLine2("E");
            addr.setCity("Chicago");
            addr.setState("IL");
            addr.setZip(60616);

            contact.setAltPhoneNumber("12345677889");
            contact.setEmail("sjesu@hawk.iit.edu");
            contact.setPhoneNumber("120191");

            empobj.setEmpFirstName("Jesu");
            empobj.setAddress(addr);
            empobj.setCotactDetails(contact);
            empobj.setDateHired(date2);
            empobj.setDob(date2);
            empobj.setEmpLastName("jesu");
            empobj.setRole("Engg.");
            empobj.setSsn(1234567890);

            Boolean check = proxy.updateEmployee(empobj);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(Utility.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception_Exception ex) {
            Logger.getLogger(Utility.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    public static Date formatDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date formattedDate = new Date();
        try {
            formattedDate = sdf.parse(date);
        } catch (ParseException e) {
            System.out.println(e.getStackTrace());
        }
        return formattedDate;
    }

    public static Date formatTime(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy:HH:mm:SS");
        Date formattedDate = new Date();
        try {
            formattedDate = sdf.parse(date);
        } catch (ParseException e) {
            System.out.println(e.getStackTrace());
        }
        return formattedDate;
    }
    private static final Logger LOG = Logger.getLogger(Utility.class.getName());
}
