package com.example.test;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String emial;
    private String phoneNumber;

    public BankAccount(){
        this("56784",2.5,"Default name", "Default address", "default number");
        System.out.println("Empty constructor CALLED");
    }
    public BankAccount(String accountNumber, double balance, String customerName, String emial, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emial = emial;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String emial, String phoneNumber) {
        this("99999", 100.55,customerName,emial,phoneNumber);

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmial() {
        return emial;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double withdrawAmount){

        if ((this.balance - withdrawAmount) < 0){
            double amountOver = 0;
            amountOver = withdrawAmount - this.balance;
            System.out.println("Not enough funds!!!");
            this.balance = 0;
            System.out.println("Your Balance is: " + this.balance + " and you could not withdraw extra " + amountOver);
        }else {
            this.balance -= withdrawAmount;
        }
    }


}
