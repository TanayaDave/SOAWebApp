/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.sjesu.webtruckshippingsystem.domain.Maintenance;
import com.wsdl.Maintenance_Service;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

     *
     * @author shrikantjesu
 */
public class MaintenanceService {
             
    public List<com.wsdl.Maintenance> maintenanceService() {
        
        Maintenance main = new Maintenance();
        Maintenance_Service mainServ = new Maintenance_Service();
        com.wsdl.MaintenanceService proxy = mainServ.getMaintenanceServicePort();
        LOG.info("list");
        List<com.wsdl.Maintenance> mainList = proxy.getAllMaintenance();
        LOG.info("list"+Arrays.asList(mainList));
        return mainList;
        
    }
    
    public void addMaintenance(com.wsdl.Maintenance main){
        Maintenance_Service mainServ = new Maintenance_Service();
        com.wsdl.MaintenanceService proxy = mainServ.getMaintenanceServicePort();
        proxy.createMaintenance(main);
      
    }
    
    
   
   public com.wsdl.Maintenance getMaintenanceById(int id){

        Maintenance main = new Maintenance();
        Maintenance_Service mainServ = new Maintenance_Service();
        com.wsdl.MaintenanceService proxy = mainServ.getMaintenanceServicePort();
        LOG.info("list");
        com.wsdl.Maintenance mainList1 = proxy.getMaintenanceById(id);       
        LOG.info("list"+Arrays.asList(mainList1));
        return mainList1;

    }

         public void updateMaintenance(com.wsdl.Maintenance main){
             Maintenance_Service mainServ = new Maintenance_Service();
             com.wsdl.MaintenanceService proxy = mainServ.getMaintenanceServicePort();
             proxy.updateMaintenanceById(main);
     }

    
     
     public void deleteById(int id){

         Maintenance main = new Maintenance();
         Maintenance_Service mainServ = new Maintenance_Service();
         com.wsdl.MaintenanceService proxy = mainServ.getMaintenanceServicePort();
         LOG.info("list");
         proxy.deleteMaintenanceById(id);
     }
    
    

     private static final Logger LOG = Logger.getLogger(Maintenance.class.getName());
}
