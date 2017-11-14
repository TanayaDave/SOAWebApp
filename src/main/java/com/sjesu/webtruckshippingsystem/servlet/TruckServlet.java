/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.servlet;

import com.sjesu.webtruckshippingsystem.services.TruckService;
import com.wsdl.Truck;
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
public class TruckServlet extends HttpServlet {

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
        String vin = request.getParameter("vin");
        String color = request.getParameter("color");
        String capacity = request.getParameter("capacity");
        String truckType = request.getParameter("truckType");
        String plateNo = request.getParameter("plateNo");
        String mYear = request.getParameter("mYear");

        Truck truck = new Truck();
        truck.setVin(vin);
        truck.setColor(color);
        truck.setCapacity(Integer.parseInt(capacity));
        truck.setType(truckType);
        truck.setLicPlateNo(plateNo);
        truck.setYear(mYear);

        TruckService truckService = new TruckService();
        truckService.createTruck(truck);
        request.getRequestDispatcher("views/truck/viewTrucks.jsp").forward(request, response);
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
