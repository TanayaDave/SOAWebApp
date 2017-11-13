/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.sjesu.webtruckshippingsystem.domain.Maintenance;
import com.wsdl.Maintenance_Service;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

     *
     * @author shrikantjesu
 */
public class MaintenanceService {
    
    public void addMaintenance(com.wsdl.Maintenance main) throws Exception{
        Maintenance_Service mainServ = new Maintenance_Service();
        com.wsdl.MaintenanceService proxy = mainServ.getMaintenanceServicePort();
        proxy.createMaintenance(main);
      
    }

     private static final Logger LOG = Logger.getLogger(Maintenance.class.getName());
}
