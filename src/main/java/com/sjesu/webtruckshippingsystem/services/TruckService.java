/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.wsdl.Truck;
import com.wsdl.TruckService_Service;
import java.util.List;

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

//    public List<Truck> getTruckList() {
//        truckProxy.
//    }

}
