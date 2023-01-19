package com.example.demo.controller;

import com.example.demo.model.Record;
import com.example.demo.model.Reward;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api", method = RequestMethod.POST)
public class RestfulApis {
    @RequestMapping(value = "/calculate-rewards", method = RequestMethod.POST)
    public Reward calculateRewards(@RequestBody Record record) {
        String customerName = record.getCustomerName();
        Integer[] transactionsInTheFirstMonth = record.getTransactionsInTheFirstMonth();
        Integer[] transactionsInTheSecondMonth = record.getTransactionsInTheSecondMonth();
        Integer[] transactionsInTheThirdMonth = record.getTransactionsInTheThirdMonth();
        Integer[] totalTransactions =record.getTotalTransactions();
        Reward reward = new Reward();
        reward.setCustomerName(customerName);
        reward.setRewardInTheFirstMonth(calculateSingleReward(transactionsInTheFirstMonth));
        reward.setRewardInTheSecondMonth(calculateSingleReward(transactionsInTheSecondMonth));
        reward.setRewardInTheThirdMonth(calculateSingleReward(transactionsInTheThirdMonth));
        reward.setTotalReward(calculateSingleReward(totalTransactions));
        return reward;
    }

    private int calculateSingleReward(Integer[] transactions) {
        int reward = 0;
        if (transactions == null)   return 0;
        for (int amount : transactions) {
            if (amount > 50)    reward += amount - 50;
            if (amount > 100)   reward += amount - 100;
        }
        return reward;
    }
}
