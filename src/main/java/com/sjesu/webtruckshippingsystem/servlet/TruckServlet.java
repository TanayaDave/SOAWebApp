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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shrikantjesu
 */
public class TruckServlet extends HttpServlet {

    TruckService truckService;
    List<Truck> singleTruck;

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
            truckService = new TruckService();
            String id = request.getParameter("param1");
            String del = request.getParameter("delete");
            String back = request.getParameter("back");

            if (id != null) {
                Truck truck = truckService.getTruckById(Integer.parseInt(id));
                singleTruck = new ArrayList<>();
                singleTruck.add(truck);
                request.setAttribute("truckList", singleTruck);
                LOG.info("reach0"+truck.getColor()+"sdf");
                request.getRequestDispatcher("/views/truck/editTruck.jsp").forward(request, response);
                
                return;
            }
            if(del!=null){
                LOG.info("reach00");
                truckService.deleteTruck(Integer.parseInt(del));
                LOG.info("reach001");
            }
            List<Truck> truckList = new TruckService().getTruckList();
            request.setAttribute("truckList", truckList);
            LOG.info("reach" + Arrays.asList(truckList));
            getServletContext().getRequestDispatcher("/views/truck/viewTrucks.jsp").forward(request, response);
        } catch (Exception e) {
        }

    }
    private static final Logger LOG = Logger.getLogger(TruckServlet.class.getName());

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
        String truckId = request.getParameter("update");
        
        Truck truck = new Truck();
        truck.setVin(vin);
        truck.setColor(color);
        truck.setCapacity(Integer.parseInt(capacity));
        truck.setType(truckType);
        truck.setLicPlateNo(plateNo);
        truck.setYear(mYear);

        TruckService truckService = new TruckService();
        if(truckId!=null){
            truck.setId(Integer.parseInt(truckId));
            truckService.updateTruck(truck);
        }else
        truckService.createTruck(truck);
        response.sendRedirect(request.getContextPath() + "/TruckServlet");
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
