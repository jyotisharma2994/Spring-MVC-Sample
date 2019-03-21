package com.wipro.bank.bean;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Jyoti on 04-03-2019.
 */
@Component
@Entity
@Table(name = "CustomerProfile")
public class Customer {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "customerIdSequence")
    @SequenceGenerator(name="customerIdSequence", allocationSize = 1)
    @Column(name = "id")
    private int customerID;

    @Column(name = "name")
    private String name;

    public Customer() {
    }

    public Customer(int id, String name) {
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                '}';
    }
}