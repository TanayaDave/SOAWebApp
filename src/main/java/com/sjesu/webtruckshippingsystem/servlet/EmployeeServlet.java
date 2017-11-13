/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.servlet;

import com.sjesu.webtruckshippingsystem.services.EmployeeService;
import static com.sjesu.webtruckshippingsystem.services.Utility.formatDate;
import com.wsdl.Address;
import com.wsdl.ContactDetails;
import com.wsdl.Employee;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author user
 */
public class EmployeeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static final long serialVersionUID = 1L;
    private EmployeeService emp;
    private EmployeeService emp1;

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            LOG.info("test");
            emp = new EmployeeService();
            List<com.wsdl.Employee> emplist = emp.employeeService();
            LOG.info("test1");
            response.setContentType("text/html;charset=UTF-8");

            request.setAttribute("emplist", emplist);
            LOG.info("test2");
            getServletContext().getRequestDispatcher("/views/employee/employees.jsp")
                    .forward(request, response);
            LOG.info(emplist.get(0).getEmpFirstName());

        } catch (Exception ex) {
            Logger.getLogger(EmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static final Logger LOG = Logger.getLogger(EmployeeServlet.class.getName());
    
     /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            GregorianCalendar gregory = new GregorianCalendar();
            String DOB = request.getParameter("DOB");
            String DOH = request.getParameter("DOH");
            XMLGregorianCalendar DOBg = null;
            XMLGregorianCalendar DOHg = null;
            Date dob1 = formatDate(DOB);
            Date doh1 = formatDate(DOH);
            try {

                gregory.setTime(dob1);
                DOBg = DatatypeFactory.newInstance()
                        .newXMLGregorianCalendar(
                                gregory);
                gregory.setTime(doh1);
                DOHg = DatatypeFactory.newInstance()
                        .newXMLGregorianCalendar(
                                gregory);
            } catch (DatatypeConfigurationException ex) {
                Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

            String FName = request.getParameter("FName");
            String LName = request.getParameter("LName");
            String AddrL1 = request.getParameter("AddrL1");
            String AddrL2 = request.getParameter("AddrL2");
            String City = request.getParameter("City");
            String State = request.getParameter("State");
            String Zip = request.getParameter("Zip");
            LOG.info("zip:" + Zip);
            int Zipint = Integer.parseInt(Zip);
            String APNo = request.getParameter("APNo");
            String PNo = request.getParameter("PNo");
            String EAddr = request.getParameter("EAddr");
            int FNo = Integer.parseInt(request.getParameter("FNo"));
            String SSN = request.getParameter("SSN");
            LOG.info("SSN:" + SSN);
            int SSNint = Integer.parseInt(SSN);
            String Role = request.getParameter("Role");
            Employee emp = new Employee();
            Address addr = new Address();
            ContactDetails cd = new ContactDetails();
            emp.setEmpFirstName(FName);
            emp.setEmpLastName(LName);
            emp.setSsn(SSNint);
            emp.setDateHired(DOHg);
            emp.setDob(DOBg);
            emp.setRole(Role);
            addr.setAddressLine1(AddrL1);
            addr.setAddressLine2(AddrL2);
            addr.setCity(City);
            addr.setState(State);
            addr.setZip(Zipint);
            cd.setAltPhoneNumber(APNo);
            cd.setEmail(EAddr);
            cd.setFaxNumber(FNo);
            cd.setPhoneNumber(PNo);
            emp.setAddress(addr);
            emp.setCotactDetails(cd);
            emp1 = new EmployeeService();
            try {
                emp1.updateEmployee(emp);
                List<com.wsdl.Employee> emplist = emp1.employeeService();
                LOG.info("test1");
                response.setContentType("text/html;charset=UTF-8");

                request.setAttribute("emplist", emplist);
                getServletContext().getRequestDispatcher("/views/employee/employees.jsp")
                        .forward(request, response);
            } catch (Exception ex) {
                Logger.getLogger(EmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
