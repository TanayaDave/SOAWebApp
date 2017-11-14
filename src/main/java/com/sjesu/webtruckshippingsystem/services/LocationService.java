/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.services;

import com.sjesu.webtruckshippingsystem.domain.Location;
import com.wsdl.Location_Service;
import java.lang.Exception;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

     *
     * @author shrikantjesu
 */

public class LocationService {

    public void addLocation(com.wsdl.Location loc) throws Exception{
        Location_Service locServ = new Location_Service();
        com.wsdl.LocationService proxy = locServ.getLocationServicePort();
        proxy.createNewLocation(loc);
        
    }
    
    private static final Logger LOG = Logger.getLogger(Location.class.getName());
}
