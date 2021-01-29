package com.example.test;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        BankAccount bankAccount = new BankAccount();
////        BankAccount bankAccount = new BankAccount("1234567", 0.0, "Marcin","marcin@dot.com","03872625");
////        bankAccount.withdraw(100);
////        System.out.println("Balance= " + bankAccount.getBalance());
////        bankAccount.deposit(50);
////        System.out.println("Balance= " + bankAccount.getBalance());
////        bankAccount.withdraw(120);
////        System.out.println("Balance= " + bankAccount.getBalance());
////        bankAccount.deposit(300);
////        System.out.println("Balance= " + bankAccount.getBalance());
////        bankAccount.withdraw(700);
////        System.out.println("Balance= " + bankAccount.getBalance());
////        System.out.println(bankAccount.getAccountNumber());
//        System.out.println(bankAccount.getAccountNumber());
//        System.out.println(bankAccount.getBalance());
//        BankAccount marcinAccount = new BankAccount("Marcin", "marcin@eail.com","0999999");
//        System.out.println(marcinAccount.getBalance()+ " " + marcinAccount.getAccountNumber());
        VipCustomer vip = new VipCustomer();
        System.out.println("name= " + vip.getName()+ " credit= " + vip.getCreditLimit() + " email= " + vip.getEmail());
        VipCustomer vip2 = new VipCustomer("Marcin",2000.0);
        System.out.println("name " + vip2.getName() + " credit " + vip2.getCreditLimit() + " email " + vip2.getEmail());
        VipCustomer vip3 = new VipCustomer("Tim", 3000.0,"tim@email.com");
        System.out.println("name " + vip3.getName() + " credit " + vip3.getCreditLimit() + " email " + vip3.getEmail());
    }
}
