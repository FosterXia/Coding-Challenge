package com.example.demo;

import com.example.demo.model.Record;
import com.example.demo.model.Reward;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;


@SpringBootTest
public class RestfulApisUnitTest {
    @Autowired
    RestTemplate restTemplate;

    @Test
    public void shouldCalculateRewardsCase1() {
        HttpHeaders headers = new HttpHeaders();
        Record record = new Record();
        record.setCustomerName("test");
        record.setTransactionsInTheFirstMonth(new Integer[] {60});
        record.setTransactionsInTheSecondMonth(new Integer[] {120});
        record.setTransactionsInTheThirdMonth(new Integer[] {180});
        record.setTotalTransactions(new Integer[] {60, 120, 180});
        HttpEntity<Record> entity = new HttpEntity<>(record,headers);
        Reward reward = restTemplate.exchange("http://localhost:8080/api/calculate-rewards", HttpMethod.POST, entity, Reward.class).getBody();
        System.out.println("Customer's name is " + reward.getCustomerName());
        System.out.println("Customer's reward in the first month is " + reward.getRewardInTheFirstMonth());
        System.out.println("Customer's reward in the second month is " + reward.getRewardInTheSecondMonth());
        System.out.println("Customer's reward in the third month is " + reward.getRewardInTheThirdMonth());
        System.out.println("Customer's total reward is " + reward.getTotalReward());
        System.out.println();
        Assert.isTrue(reward.getCustomerName().equals(record.getCustomerName()), "customer's name is not the same");
        Assert.isTrue(reward.getRewardInTheFirstMonth() == 10, "The reward in the first month is incorrect");
        Assert.isTrue(reward.getRewardInTheSecondMonth() == 90, "The reward in the second month is incorrect");
        Assert.isTrue(reward.getRewardInTheThirdMonth() == 210, "The reward in the third month is incorrect");
        Assert.isTrue(reward.getTotalReward() == 310, "The total reward is incorrect");
    }

    @Test
    public void shouldCalculateRewardsCase2() {
        HttpHeaders headers = new HttpHeaders();
        Record record = new Record();
        record.setCustomerName("test2");
        record.setTransactionsInTheFirstMonth(new Integer[] {10});
        record.setTransactionsInTheSecondMonth(new Integer[] {30});
        record.setTransactionsInTheThirdMonth(new Integer[] {20});
        record.setTotalTransactions(new Integer[] {10, 30, 20});
        HttpEntity<Record> entity = new HttpEntity<>(record,headers);
        Reward reward = restTemplate.exchange("http://localhost:8080/api/calculate-rewards", HttpMethod.POST, entity, Reward.class).getBody();
        System.out.println("Customer's name is " + reward.getCustomerName());
        System.out.println("Customer's reward in the first month is " + reward.getRewardInTheFirstMonth());
        System.out.println("Customer's reward in the second month is " + reward.getRewardInTheSecondMonth());
        System.out.println("Customer's reward in the third month is " + reward.getRewardInTheThirdMonth());
        System.out.println("Customer's total reward is " + reward.getTotalReward());
        System.out.println();
        Assert.isTrue(reward.getCustomerName().equals(record.getCustomerName()), "customer's name is not the same");
        Assert.isTrue(reward.getRewardInTheFirstMonth() == 0, "The reward in the first month is incorrect");
        Assert.isTrue(reward.getRewardInTheSecondMonth() == 0, "The reward in the second month is incorrect");
        Assert.isTrue(reward.getRewardInTheThirdMonth() == 0, "The reward in the third month is incorrect");
        Assert.isTrue(reward.getTotalReward() == 0, "The total reward is incorrect");
    }
}
