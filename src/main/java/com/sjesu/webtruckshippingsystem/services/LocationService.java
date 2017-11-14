/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.sjesu.webtruckshippingsystem.domain.Location;
import com.sjesu.webtruckshippingsystem.domain.Pricing;
import com.wsdl.Employee;
import com.wsdl.EmployeeService_Service;
import com.wsdl.Exception_Exception;
import com.wsdl.Location_Service;
import java.lang.Exception;
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

public class LocationService {

    public void addLocation(com.wsdl.Location loc) throws Exception {
        Location_Service locServ = new Location_Service();
        com.wsdl.LocationService proxy = locServ.getLocationServicePort();
        proxy.createNewLocation(loc);

    }

    public List<com.wsdl.Location> priceService() {

        Location_Service locServ = new Location_Service();
        com.wsdl.LocationService proxy = locServ.getLocationServicePort();
        return proxy.getAllLocation();

    }

    public com.wsdl.Location getPriceById(int id) {

        Location_Service locser = new Location_Service();
        com.wsdl.LocationService proxy = locser.getLocationServicePort();
        com.wsdl.Location locList1 = proxy.getLocationById(id);
        return locList1;

    }

    public void updatePricing(com.wsdl.Location loc) {
        Location_Service empServ = new Location_Service();
        com.wsdl.LocationService proxy = empServ.getLocationServicePort();
        proxy.updateLocation(loc);
    }

    public void deleteById(int id) {

        Location_Service locser1 = new Location_Service();
        com.wsdl.LocationService proxy = locser1.getLocationServicePort();
        proxy.deleteLocation(id);
    }

    private static final Logger LOG = Logger.getLogger(Location.class.getName());
}
