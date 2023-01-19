package com.example.demo.model;

public class Record {
    private String customerName;
    private Integer[] transactionsInTheFirstMonth;
    private Integer[] transactionsInTheSecondMonth;
    private Integer[] transactionsInTheThirdMonth;
    private Integer[] totalTransactions;

    public String getCustomerName() {
        return customerName;
    }

    public Integer[] getTransactionsInTheFirstMonth() {
        return transactionsInTheFirstMonth;
    }

    public Integer[] getTransactionsInTheSecondMonth() {
        return transactionsInTheSecondMonth;
    }

    public Integer[] getTransactionsInTheThirdMonth() {
        return transactionsInTheThirdMonth;
    }

    public Integer[] getTotalTransactions() {
        return totalTransactions;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTransactionsInTheFirstMonth(Integer[] transactionsInTheFirstMonth) {
        this.transactionsInTheFirstMonth = transactionsInTheFirstMonth;
    }

    public void setTransactionsInTheSecondMonth(Integer[] transactionsInTheSecondMonth) {
        this.transactionsInTheSecondMonth = transactionsInTheSecondMonth;
    }

    public void setTransactionsInTheThirdMonth(Integer[] transactionsInTheThirdMonth) {
        this.transactionsInTheThirdMonth = transactionsInTheThirdMonth;
    }

    public void setTotalTransactions(Integer[] totalTransactions) {
        this.totalTransactions = totalTransactions;
    }
}
