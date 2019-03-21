package com.wipro.bank.bean;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by JYOTI on 04-03-2019.
 */

@Component
@Entity
@Table(name = "Account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accountSequence")
    @SequenceGenerator(name = "accountSequence", allocationSize = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "Accountid")
    private int Accountid;

    @OneToOne
    private Customer customer;

    @Column(name = "Balance")
    private double Balance;

    public Account() {
    }

    public Account(int accountID, Customer customer, double balance) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountid() {
        return Accountid;
    }

    public void setAccountid(int accountid) {
        Accountid = accountid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }
}