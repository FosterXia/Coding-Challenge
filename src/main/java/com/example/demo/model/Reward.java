package com.example.demo.model;

public class Reward {
    private String customerName;
    private int rewardInTheFirstMonth;
    private int rewardInTheSecondMonth;
    private int rewardInTheThirdMonth;
    private int totalReward;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getRewardInTheFirstMonth() {
        return rewardInTheFirstMonth;
    }

    public void setRewardInTheFirstMonth(int rewardInTheFirstMonth) {
        this.rewardInTheFirstMonth = rewardInTheFirstMonth;
    }

    public int getRewardInTheSecondMonth() {
        return rewardInTheSecondMonth;
    }

    public void setRewardInTheSecondMonth(int rewardInTheSecondMonth) {
        this.rewardInTheSecondMonth = rewardInTheSecondMonth;
    }

    public int getRewardInTheThirdMonth() {
        return rewardInTheThirdMonth;
    }

    public void setRewardInTheThirdMonth(int rewardInTheThirdMonth) {
        this.rewardInTheThirdMonth = rewardInTheThirdMonth;
    }

    public int getTotalReward() {
        return totalReward;
    }

    public void setTotalReward(int totalReward) {
        this.totalReward = totalReward;
    }
}
