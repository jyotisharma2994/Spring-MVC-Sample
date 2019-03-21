package com.test.bank.controller;

import com.test.bank.bean.Account;
import com.test.bank.service.AccountService;
import com.test.bank.bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jyoti on 04-03-2019.
 */
@Controller
public class AccountBalanceController {

    @Autowired
    AccountService accountService;

    @Autowired
    Customer customer;

    @Autowired
    Account account;

    @RequestMapping("/")
    public String showHomePage() {
        return ("Home");
    }

    @RequestMapping(value = "/showSearchAccountByID")
    public String getAccountBalancePage() {
        return "getAccountBalance";
    }

    @RequestMapping(value = "/displayAccountOrCustomer")
    public String getAccountsOrCustomersPage() {
        return "DisplayAccountsORCustomers";
    }

    @RequestMapping(value = "/getAccountBalance")
    public String getAccountBalance() {
        return "getAccountBalance";
    }

    @RequestMapping(value = "/displayAccountOrCustomer")
    public String getAccountOrCustomere() {
        return "DisplayAccountsORCustomers";
    }
//
//    @RequestMapping(value="displayAccountOrCustomer",method=RequestMethod.POST)
//    public String getAccountOrCustomere(@RequestParam Map<String, String> map, HttpSession httpSession, Model model) {
//        String str=null;
//        String str03 = map.get("name");
//        List<Account> list = null;
//
//        if (str03.equals("account"))
//        {
//            list = accountService.getAllAccounts();
//        }
//        else if(str03.equals("customer"))
//        {
//            list = accountService.getAllCustomers();
//        }
//
//        System.out.println("in controller " + str03 +" "+list.size());
//        if (list == null || list.isEmpty())
//        {
//            System.out.println("AdminController:false");
//            String str02="Invalid Data..";
//            model.addAttribute("msg",str02);
//            str="DisplayAccountsORCustomers";
//        }
//        else {
//            Iterator<Account> iterator = list.iterator();
//            while (iterator.hasNext()) {
//                System.out.println("New Customer Servlet " + iterator.next());
//                model.addAttribute("list", list);
//                str = "DisplayAccountsORCustomers";
//            }
//        }
//        return str;
//    }
//
//-----------------------controller -----displayCustomerOrAccount
}
