/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.servlet;

import com.sjesu.webtruckshippingsystem.domain.Pricing;
import com.sjesu.webtruckshippingsystem.services.EmployeeService;
import com.sjesu.webtruckshippingsystem.services.LocationService;
import com.wsdl.Employee;
import com.wsdl.Location;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class PricingServlet extends HttpServlet {
    private LocationService locs;
    private LocationService locs1;


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

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
            locs = new LocationService();

            String id = request.getParameter("param1");
            String del = request.getParameter("delete");
            String back = request.getParameter("back");

            if (id != null) {
                Location dat = locs.getPriceById(Integer.parseInt(id));
                response.setContentType("text/html;charset=UTF-8");
                List<com.wsdl.Location> singleLoc = new ArrayList<>();
                singleLoc.add(dat);

                request.setAttribute("locs", singleLoc);
                 getServletContext().getRequestDispatcher("/views/pricing/editPricing.jsp")
                        .forward(request, response);
                 return;
            }

            if (back !=null){
             List<com.wsdl.Location> loclist = locs.priceService();
             response.setContentType("text/html;charset=UTF-8");
             request.setAttribute("loclist", loclist);
             getServletContext().getRequestDispatcher("/views/pricing/pricing.jsp")
                    .forward(request, response);
            return;

            }
            
            
            if (del != null) {
                locs.deleteById(Integer.parseInt(del.replaceAll(" ", "")));
             List<com.wsdl.Location> loclist = locs.priceService();
             response.setContentType("text/html;charset=UTF-8");
             request.setAttribute("loclist", loclist);
             getServletContext().getRequestDispatcher("/views/pricing/pricing.jsp")
                    .forward(request, response);
            return;
            }

            List<com.wsdl.Location> loclist = locs.priceService();
             response.setContentType("text/html;charset=UTF-8");
             request.setAttribute("loclist", loclist);
             getServletContext().getRequestDispatcher("/views/pricing/pricing.jsp")
                    .forward(request, response);

         } catch (Exception ex) {
            Logger.getLogger(PricingServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        String eid = request.getParameter("update");
         String loccode = request.getParameter("loccode");
         String locname = request.getParameter("locname");
         String price = request.getParameter("price");
         Location loc = new Location();
         if (eid !=null){
         loc.setLocId(Integer.parseInt(eid));
         }
         loc.setLocCode(loccode);
         loc.setLocName(locname);
         loc.setPrice(Integer.parseInt(price));
         LocationService loc1= new LocationService();
        locs1 = new LocationService();

          try {
              if (eid != null) {
                    locs1.updatePricing(loc);

                } else {
                    locs1.addLocation(loc);
                }
             List<com.wsdl.Location> loclist = locs1.priceService();
             response.setContentType("text/html;charset=UTF-8");

            request.setAttribute("loclist", loclist);
             getServletContext().getRequestDispatcher("/views/pricing/pricing.jsp")
                    .forward(request, response);

          }
               // LOG.info("test1");
               // response.setContentType("text/html;charset=UTF-8");

                //request.setAttribute("loclist", loclist);
                //getServletContext().getRequestDispatcher("/views/pricing/pricing.jsp")
                  //      .forward(request, response);
             catch (Exception ex) {
                Logger.getLogger(EmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
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
