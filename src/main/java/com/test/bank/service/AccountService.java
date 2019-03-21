package com.test.bank.service;

import com.test.bank.bean.Account;
import com.test.bank.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Jyoti on 04-03-2019.
 */
@Service
public class AccountService {

    @Autowired
    AccountDao accountDao;

    public String transferFunds(int acc, int to, double amount) {
        double balanceOfFromAccount = (getBalanceOf(acc)).getBalance();
        String result1 = checkIdIsPresent(acc);
        String result2 = checkIdIsPresent(to);
        if ("Account ID Not Found".equals(result2) && "Account ID Not Found".equals(result1)) {
            if (balanceOfFromAccount < amount) {
                return "INSUFFICIENT FUNDS";
            } else {
                return "SUCCESS";
            }
        }
        return "Account Id Not Found";
    }

    private String checkIdIsPresent(int accountId) {
        Account account1 = accountDao.findById(accountId);
        if (account1 == null) {
            return "Account ID Not Found";
        }
        return "Account ID exists";
    }

    public Account getBalanceOf(int accountNumber) {
        List<Account> accountList = accountDao.findAllAccounts();
        for (Account account : accountList) {
            if (accountNumber == account.getId()) {
                return account;
            }
        }
        return null;
    }

    public String addAccount(Account account) {
        accountDao.saveAccount(account, account.getCustomer());
        return "ACCOUNT SAVED";
    }

    public List<Account> getAllCustomers() {
        List<Account> accountList = accountDao.findAllAccounts();
        Iterator<Account> iterator = accountList.iterator();
        while (iterator.hasNext()) {
            System.out.println("in Service " + iterator.next());
        }
        return accountList;
    }
}
