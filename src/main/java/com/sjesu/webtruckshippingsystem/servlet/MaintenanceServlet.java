/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.servlet;


import com.sjesu.webtruckshippingsystem.services.MaintenanceService;
import static com.sjesu.webtruckshippingsystem.services.Utility.formatDate;
import com.wsdl.Maintenance;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
public class MaintenanceServlet extends HttpServlet {

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
    private MaintenanceService maint;
    private MaintenanceService maint1;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                               
         try{
             
             maint = new MaintenanceService();
             
            String id = request.getParameter("param1");
            String del = request.getParameter("delete");
            String back = request.getParameter("back");
             
             
            if (id != null) {
                Maintenance dat = maint.getMaintenanceById(Integer.parseInt(id));
                response.setContentType("text/html;charset=UTF-8");
                List<com.wsdl.Maintenance> singleMain = new ArrayList<>();
                singleMain.add(dat);
               

                request.setAttribute("main", singleMain);
                LOG.info("test2");
                getServletContext().getRequestDispatcher("/views/maintenance/editMaintenance.jsp")
                        .forward(request, response);
                LOG.info(dat.getDesc());

                return;
            }
            
            
            if (back !=null){
                            List<com.wsdl.Maintenance> mainlist = maint.maintenanceService();
            LOG.info("test1");
            response.setContentType("text/html;charset=UTF-8");

            request.setAttribute("mainlist", mainlist);
            LOG.info("test2");
            getServletContext().getRequestDispatcher("/views/maintenance/maintenance.jsp")
                    .forward(request, response);
            return;

            }
            
             if (del != null) {
                 maint.deleteById(Integer.parseInt(del.replaceAll(" ", "")));
                
            LOG.info("test");
            List<com.wsdl.Maintenance> mainlist = maint.maintenanceService();
            LOG.info("test1");
            response.setContentType("text/html;charset=UTF-8");

            request.setAttribute("mainlist", mainlist);
            LOG.info("test2");
            getServletContext().getRequestDispatcher("/views/maintenance/maintenance.jsp")
                    .forward(request, response);
            return;
            }
            
             
             LOG.info("test");
             
             List<com.wsdl.Maintenance> mainlist = maint.maintenanceService();
             LOG.info("test1");
             response.setContentType("text/html;charset=UTF-8");
             
             request.setAttribute("mainlist", mainlist);
             LOG.info("test2");
             getServletContext().getRequestDispatcher("/views/maintenance/maintenance.jsp")
                     .forward(request,response);             
              LOG.info(mainlist.get(0).getDesc());
             
         } catch(Exception ex){
             Logger.getLogger(MaintenanceServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        
        String mainid = request.getParameter("update");
         GregorianCalendar gregory = new GregorianCalendar(); 
         XMLGregorianCalendar dateXML = null;
         String date = request.getParameter("date");
         Date date1 = formatDate(date);
         String description = request.getParameter("description");
         String cost = request.getParameter("cost");
         String status = request.getParameter("status");
         Maintenance maint = new Maintenance();
         maint.setCost(Double.parseDouble(cost));
         maint.setDesc(description);   
         if (mainid !=null){
             maint.setId(Integer.parseInt(mainid));
            }
         try {

                gregory.setTime(date1);
                dateXML = DatatypeFactory.newInstance()
                        .newXMLGregorianCalendar(
                                gregory);               
            } catch (DatatypeConfigurationException ex) {
                Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
         maint.setDate(dateXML);         
         maint.setStatus(status);
         maint1 = new MaintenanceService();
         try {
                if (mainid != null) {                   
                    maint1.updateMaintenance(maint);

                } else {
                    maint1.addMaintenance(maint);
                }                                              
            List<com.wsdl.Maintenance> mainlist = maint1.maintenanceService();
            LOG.info("test1");
                response.setContentType("text/html;charset=UTF-8");

                request.setAttribute("mainlist", mainlist);
                getServletContext().getRequestDispatcher("/views/maintenance/maintenance.jsp")
                        .forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(MaintenanceServlet.class.getName()).log(Level.SEVERE, null, ex);
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
