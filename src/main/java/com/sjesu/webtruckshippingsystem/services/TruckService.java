/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.wsdl.Exception_Exception;
import com.wsdl.Truck;
import com.wsdl.TruckService_Service;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TruckService {

    TruckService_Service truckService;
    com.wsdl.TruckService truckProxy;

    public TruckService() {
        truckService = new TruckService_Service();
        truckProxy = truckService.getTruckServicePort();
    }

    public void createTruck(Truck truck) {
        truckProxy.createTruck(truck);
    }

    public List<Truck> getTruckList() {
        return truckProxy.getAllTrucks();
    }

    public Truck getTruckById(int id) {
        return truckProxy.getTruckDetailsById(id);
    }

    public boolean updateTruck(Truck truck) {
        return truckProxy.updateTruck(truck);
    }
    
    public boolean deleteTruck(int id){
        try {
            truckProxy.deleteTruck(id);
        } catch (Exception_Exception ex) {
            Logger.getLogger(TruckService.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return true;
    }

}
