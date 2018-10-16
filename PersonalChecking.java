package com.williams.kailyn;

public class PersonalChecking extends Bank {

    private double depositMonthTotal;
    private boolean monthDone;
    private int numOfWithdrawals=0;
    private int numOfDeposits=0;

    public PersonalChecking(String name, String address, String email, String phone,int acctNum, double currentBal){
        super(name, address, email, phone, acctNum, currentBal);
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
        depositMonthTotal+=amount;
        numOfDeposits++;

    }
    protected void withdrawal(double amount){
        if(monthDone) {
            numOfWithdrawals=0;
            numOfDeposits=0;
            monthDone=false;
        }
            currentBal-=amount;
        numOfWithdrawals++;
    }

    protected void monthlyFee(){
       if(depositMonthTotal>500){
           System.out.println("Fee waived");
           monthDone=true;
       }
       else{
           currentBal-=10;
           monthDone=true;
       }
    }

    protected void checkBalance(){
        System.out.println("Balance: $"+ currentBal);
    }

    protected void monthlyInterest(){
        System.out.println("No Interest added to "+ name+"'s Account: " );
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
