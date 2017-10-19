package com.sjesu.webtruckshippingsystem.domain;

import com.sjesu.webtruckshippingsystem.domain.Customer;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-19T00:32:02")
@StaticMetamodel(Order.class)
public class Order_ { 

    public static volatile SingularAttribute<Order, Integer> truckId;
    public static volatile SingularAttribute<Order, Integer> totalAmount;
    public static volatile SingularAttribute<Order, Integer> orderId;
    public static volatile SingularAttribute<Order, Integer> unitCost;
    public static volatile SingularAttribute<Order, Integer> qnty;
    public static volatile SingularAttribute<Order, Integer> custId;
    public static volatile SingularAttribute<Order, Integer> employeeId;
    public static volatile SingularAttribute<Order, Date> orderDate;
    public static volatile SingularAttribute<Order, Integer> locId;
    public static volatile SingularAttribute<Order, Customer> customer;

}