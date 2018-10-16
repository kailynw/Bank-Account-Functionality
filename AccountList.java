package com.williams.kailyn;

import java.util.ArrayList;

public class AccountList {

    public ArrayList<Bank> account= new ArrayList<>();
    public ArrayList<Bank> closedAccounts= new ArrayList<>();
    public AccountList() {

    }


    public void newAccountBusinessChecking(String name, String address, String email, String phone, int acctNum, double currentBal) {
        deleteRepeatedAccount(acctNum);
        account.add(new BusinessChecking(name, address, email, phone, acctNum, currentBal));
    }

    public void newAccountBusinessSavings(String name, String address, String email, String phone, int acctNum, double currentBal) {
        deleteRepeatedAccount(acctNum);
        account.add(new BusinessSavings(name, address, email, phone, acctNum, currentBal));
    }

    public void newAccountPersonalChecking(String name, String address, String email, String phone, int acctNum, double currentBal) {
        deleteRepeatedAccount(acctNum);
        account.add( new PersonalChecking(name, address, email, phone, acctNum, currentBal));
    }

    public void newAccountPersonalSavings(String name, String address, String email, String phone, int acctNum, double currentBal) {
        deleteRepeatedAccount(acctNum);
        account.add( new PersonalSavings(name, address, email, phone, acctNum, currentBal));
    }

    //Apply's fee to all accounts
    public void applyfee() {

        for (int i = 0; i <account.size(); i++) {
           account.get(i).monthlyFee();
        }
    }


    //Apply's Interest to all saving's accounts
    public void addIntrest() {
        for (int i = 0; i < account.size(); i++) {
            account.get(i).monthlyInterest();
        }
    }


    //Queries an account by account number
    public Bank findAccoount(int accountNumber){

        for(int i=0; i<account.size();i++){
            if(account.get(i).acctNum==accountNumber) {
                System.out.println("Account Found... \n" + account.get(i));
                return account.get(i);
            }
        }
        System.out.println("No account found");
        return null;

    }


    //Closes account and stores it in another list
    public void closeAccount(int accountNumber){
        for(int i=0; i<account.size();i++){
            if(account.get(i).acctNum==accountNumber) {
               closedAccounts.add(account.get(i));
               account.remove(i);
               return;
            }
        }
        System.out.println("No account found");

    }

    public void printAccountData(){
        for(int i =0; i<account.size();i++){
            System.out.println(account.get(i));
        }
    }

    public void deleteRepeatedAccount(int acctNum){
        for (int i=0; i<account.size();i++){
            if(account.get(i).acctNum==acctNum)
                return;
        }
    }




}

