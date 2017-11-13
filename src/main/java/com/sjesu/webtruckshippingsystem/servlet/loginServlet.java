/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.servlet;

import com.sjesu.webtruckshippingsystem.domain.Address;
import com.sjesu.webtruckshippingsystem.domain.ContactDetails;
import com.sjesu.webtruckshippingsystem.domain.Customer;
import com.sjesu.webtruckshippingsystem.services.LoginService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class loginServlet extends HttpServlet {

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
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String pass = request.getParameter("pass");
        String userType = null;
        boolean loginSuccess = false;

        String signup = request.getParameter("signup");
        try {
            if (signup != null && signup.equals("signup")) {
                String fName = request.getParameter("fName");
                String lName = request.getParameter("lName");
                String addrline1 = request.getParameter("addrline1");
                String addrline2 = request.getParameter("addrline2");
                String city = request.getParameter("city");
                String state = request.getParameter("state");
                String zip = request.getParameter("zip");
                String phoneNo = request.getParameter("phoneNo");
                String email = request.getParameter("email");

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
//                response.sendRedirect("loginPage.jsp");
                request.getRequestDispatcher("/loginPage.jsp").forward(request, response);
            } else {
                loginSuccess = LoginService.userLogin(username, pass);
                if (loginSuccess) {
                    if (username.equals("admin")) {
                        response.sendRedirect("welcome.jsp");
                    } //out.println("Correct login credentials");
                    else {
                        response.sendRedirect("views/customer/customer.jsp");
                    }
                }
            }

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
