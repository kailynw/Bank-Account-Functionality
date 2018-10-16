package com.williams.kailyn;

public class BusinessSavings extends Bank {
    boolean monthDone=false;
    private int numOfWithdrawals=0;
    private int numOfDeposits=0;

    public BusinessSavings(String name, String address, String email, String phone, int acctNum, double currentBal){
        super(name,address, email, phone, acctNum, currentBal);
    }


    protected int getNumOfDeposits(){
        return numOfDeposits;
    }
    protected int getNumOfWithdrawals(){
        return numOfWithdrawals;
    }

    protected void deposit(double amount){
        if(monthDone) {
            numOfWithdrawals=0;
            numOfDeposits=0;
            monthDone=false;
        }
        currentBal+= amount;
        numOfDeposits++;
    }

    protected void withdrawal(double amount){
        if(monthDone) {
            numOfWithdrawals=0;
            numOfDeposits=0;
            monthDone=false;
        }
        currentBal-=amount+10;
    }

    protected void monthlyFee(){
       currentBal-=20;

       monthDone=true;
    }

    protected void checkBalance(){
        System.out.println("Balance: $"+ currentBal);
    }

    protected void monthlyInterest(){

            double interestCalc = .025;
            interestCalc = interestCalc * currentBal;
            currentBal += interestCalc;
            System.out.println("Interest added to "+ name+"'s balance: " + interestCalc);


    }


    public String toString(){
        String result;
        result="Name: " +name+ "\n"+
                "Address: "+ address+"\n"+
                "Email: "+ email+ "\n" +
                "Phone: "+ phone+ "\n" +
                "Account Number: "+ acctNum+ "\n"+
                "Current Balance: $"+ currentBal +"\n"+ "----------------------------------\n";

        return result;
    }
}
