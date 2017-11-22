/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjesu.webtruckshippingsystem.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author user
 */
@Entity(name = "OrderTable")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
//    @Native
//    @Column(name = "OrdDate")
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    private String locFrom;

    private String locTo;

    private String custName;

    private String vin;
    
    private Integer amt;

    public String getLocFrom() {
        return locFrom;
    }

    public void setLocFrom(String locFrom) {
        this.locFrom = locFrom;
    }

    public String getLocTo() {
        return locTo;
    }

    public void setLocTo(String locTo) {
        this.locTo = locTo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getAmt() {
        return amt;
    }

    public void setAmt(Integer amt) {
        this.amt = amt;
    }

    /**
     * Get the value of orderDate
     *
     * @return the value of orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Set the value of orderDate
     *
     * @param orderDate new value of orderDate
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", orderDate=" + orderDate + ", locFrom=" + locFrom + ", locTo=" + locTo + ", custName=" + custName + ", vin=" + vin + ", amt=" + amt + '}';
    }

}
