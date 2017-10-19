package com.sjesu.webtruckshippingsystem.domain;

import com.sjesu.webtruckshippingsystem.domain.Address;
import com.sjesu.webtruckshippingsystem.domain.ContactDetails;
import com.sjesu.webtruckshippingsystem.domain.Order;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-19T15:07:51")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Address> address;
    public static volatile SingularAttribute<Customer, String> custFirstName;
    public static volatile SingularAttribute<Customer, ContactDetails> contactdetails;
    public static volatile SingularAttribute<Customer, String> custTitle;
    public static volatile SingularAttribute<Customer, String> custLastName;
    public static volatile SingularAttribute<Customer, Integer> custId;
    public static volatile ListAttribute<Customer, Order> orders;

}