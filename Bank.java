package com.williams.kailyn;

import java.util.Random;

public abstract class Bank {
    protected String name;
    protected String address;
    protected String email;
    protected String phone;
    protected int acctNum=generateRandomAcctNum();
    protected double currentBal;

    public Bank(String name, String address, String email, String phone, int acctNum, double currentBal){
        this.name= name;
        this.address= address;
        this.email=email;
        this.phone= phone;
        if(acctNum<99999 && acctNum>10000)
        this.acctNum=acctNum;
        this.currentBal=currentBal;
    }

    protected static int generateRandomAcctNum(){
        Random random= new Random();
        return random.nextInt(100000);

    }


    public abstract String toString();
    abstract void deposit(double amount);
    abstract void withdrawal(double amount);
    abstract void monthlyFee();
    abstract void checkBalance();
    abstract void monthlyInterest();


}
