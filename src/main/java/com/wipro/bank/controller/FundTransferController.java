package com.wipro.bank.controller;

import com.wipro.bank.service.AccountService;
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
public class FundTransferController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/showTransferFunds")
    public String showTransferFundsPage() {
        return ("TransferFunds");
    }

    @RequestMapping(value = "/transferFunds1", method = RequestMethod.POST)
    public String transferFunds(@RequestParam Map<String, String> map) {
        int fromAccountNumber = Integer.parseInt(map.get("senderAccountId"));
        int toAccountNumber = Integer.parseInt(map.get("receiverAccountId"));
        Double amount = Double.parseDouble(map.get("balance"));
        String status = accountService.transferFunds(fromAccountNumber, toAccountNumber, amount);
        System.out.println(status);
        System.out.println(fromAccountNumber + "  " + "  " + toAccountNumber + "  " + amount);
        return "GeneralResponse";
    }
}
