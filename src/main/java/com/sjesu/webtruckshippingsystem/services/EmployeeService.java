/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.wsdl.Employee;
import com.wsdl.EmployeeService_Service;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

     *
     * @author shrikantjesu
 */
public class EmployeeService {

    public List<com.wsdl.Employee> employeeService() throws Exception {

        Employee emp = new Employee();
        EmployeeService_Service empServ = new EmployeeService_Service();
        com.wsdl.EmployeeService proxy = empServ.getEmployeeServicePort();
        LOG.info("list");
        List<com.wsdl.Employee> empList=proxy.getEmployeeList();
        LOG.info("list"+Arrays.asList(empList));
        return empList;

    }
    
     public Employee getEmployeeById(int id) throws Exception {

        Employee emp = new Employee();
        EmployeeService_Service empServ = new EmployeeService_Service();
        com.wsdl.EmployeeService proxy = empServ.getEmployeeServicePort();
        LOG.info("list");
        Employee empList1 =proxy.getEmployeeById(id);
        LOG.info("list"+Arrays.asList(empList1));
        return empList1;

    }
     
     public void deleteById(int id) throws Exception {

        Employee emp = new Employee();
        EmployeeService_Service empServ = new EmployeeService_Service();
        com.wsdl.EmployeeService proxy = empServ.getEmployeeServicePort();
        LOG.info("list");
        proxy.deleteEmployee(id);
     }
    
    public void newEmployee(com.wsdl.Employee emp) throws Exception {
        EmployeeService_Service empServ = new EmployeeService_Service();
        com.wsdl.EmployeeService proxy = empServ.getEmployeeServicePort();
        proxy.createEmployee(emp);
     }
    
     public void updateEmployee(com.wsdl.Employee emp) throws Exception {
        EmployeeService_Service empServ = new EmployeeService_Service();
        com.wsdl.EmployeeService proxy = empServ.getEmployeeServicePort();
        proxy.updateEmployee(emp);
     }
    
    private static final Logger LOG = Logger.getLogger(EmployeeService.class.getName());

}