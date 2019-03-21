package com.wipro.bank.dao;

import com.wipro.bank.bean.Account;
import com.wipro.bank.bean.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jyoti on 04-03-2019.
 */
@Repository
public class AccountDao {

    @Autowired
    SessionFactory sessionFactory;

    public static List<Account> accounts;
    public static List<Customer> customers;

    public String saveAccount(Account account, Customer customer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        session.save(account);
        transaction.commit();
        session.close();
        return "Saved Account";
    }

    public List<Account> findAllAccounts() {
        accounts = new ArrayList<>();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session
                .createQuery("from Account");
        accounts = query.list();
        return accounts;
    }

    public String saveCustomer(Customer customer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
        return "Saved Customer";
    }

    public List<Customer> findAllCustomers() {
        customers = new ArrayList<>();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session
                .createQuery("from Customer");
        accounts = query.list();
        return customers;
    }

    public static List<Account> getAccounts() {
        return accounts;
    }

    public static void setAccounts(List<Account> accounts) {
        AccountDao.accounts = accounts;
    }

    public static List<Customer> getCustomer() {
        return customers;
    }

    public static void setCustomer(List<Customer> customer) {
        AccountDao.customers = customer;
    }

    public Account findById(int accountId) {
        Account account = new Account();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Account A WHERE A.id = :id";
        Query query = session.createQuery(hql).setInteger("id",accountId);
        account = (Account) query.list().get(0);
        return account;
    }
}