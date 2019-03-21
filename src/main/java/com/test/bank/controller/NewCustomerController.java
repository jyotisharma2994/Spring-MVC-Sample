package com.test.bank.controller;

import com.test.bank.bean.Account;
import com.test.bank.service.AccountService;
import com.test.bank.bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by Jyoti on 04-03-2019.
 */
@Controller
public class NewCustomerController {

    @Autowired
    AccountService accountService;

    @Autowired
    Account account;

    @Autowired
    Customer customer;

    @RequestMapping("/showHomePage")
    public String showHomePageBack() {
        return ("Home");
    }

    @RequestMapping("/showCreateNewAccount")
    public String showCreateNewAccountPage() {
        return ("CreateNewAccountForm");
    }

    @RequestMapping(value = "/saveCreateNewAccount", method = RequestMethod.POST)
    public String saveNewlyCreatedCustomer(@RequestParam Map<String, String> map) {
        String customerName = map.get("customerName");
        customer.setName(customerName);
        System.out.println(map.get("accountBalance"));
        account.setBalance(Double.parseDouble(map.get("accountBalance")));
        account.setCustomer(customer);
        String result = accountService.addAccount(account);
        System.out.println(account.getBalance());
        System.out.println(customerName);
        System.out.println(result);
        return "GeneralResponse";
    }
}