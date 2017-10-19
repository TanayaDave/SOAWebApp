package com.sjesu.webtruckshippingsystem.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-19T15:07:51")
@StaticMetamodel(Invoice.class)
public class Invoice_ { 

    public static volatile SingularAttribute<Invoice, Date> date;
    public static volatile SingularAttribute<Invoice, Double> total;
    public static volatile SingularAttribute<Invoice, Integer> orderId;
    public static volatile SingularAttribute<Invoice, Integer> custId;
    public static volatile SingularAttribute<Invoice, Integer> invoiceId;
    public static volatile SingularAttribute<Invoice, Integer> locId;

}