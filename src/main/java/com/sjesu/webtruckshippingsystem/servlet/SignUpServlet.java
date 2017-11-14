/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.servlet;

import com.sjesu.webtruckshippingsystem.services.CustomerService;
import com.sjesu.webtruckshippingsystem.services.LoginService;
import com.wsdl.Address;
import com.wsdl.ContactDetails;
import com.wsdl.Customer;
import com.wsdl.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shrikantjesu
 */
public class SignUpServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SignUp</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignUp at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        processRequest(request, response);
    }

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
        String fName = request.getParameter("fName");
        String lName = request.getParameter("lName");
        String addrline1 = request.getParameter("addrline1");
        String addrline2 = request.getParameter("addrline2");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");
        String phoneNo = request.getParameter("phoneNo");
        String email = request.getParameter("email");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        try {
            Customer customer = new Customer();
            customer.setCustFirstName(fName);
            customer.setCustLastName(lName);
            Address address = new Address();
            address.setAddressLine1(addrline1);
            address.setAddressLine2(addrline2);
            address.setCity(city);
            address.setZip(Integer.parseInt(zip));
            address.setState(state);
            ContactDetails contactDetails = new ContactDetails();
            contactDetails.setPhoneNumber(phoneNo);
            contactDetails.setEmail(email);
            customer.setAddress(address);
            customer.setContactdetails(contactDetails);
            
            User user=new User();
            user.setUserName(userName);
            user.setPassword(password);
            user.setUserType("customer");
            
            CustomerService.createCustomer(customer);
            new LoginService().createUser(user);
            request.getRequestDispatcher("/loginPage.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
