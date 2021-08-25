package com.training.org;

public class YBank {
    private String bankName;
    private String bankAddress;
    private int noOfEmployees;

    public YBank() {
        System.out.println("default constructor of YBank is called");
        bankName = "";
        bankAddress = "";
        noOfEmployees = 0;
    }

    public YBank(String bankName, String bankAddress, int noOfEmployees) {
        System.out.println("Parameterised constructor of YBank is called");
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.noOfEmployees = noOfEmployees;
    }

    public String toString() {
        return "Bank Details are " + bankName + " Address " + bankAddress + " NoOfEmployees" + noOfEmployees;
    }
}

