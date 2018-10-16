package com.williams.kailyn;

public class Main {

    public static void main(String[] args) {
      AccountList wellsFargo= new AccountList();

      wellsFargo.newAccountBusinessChecking("Kailyn" ,"702 Birch","kailynw@gmail.com","864-279-1689",86213,569);
      wellsFargo.newAccountPersonalSavings("Sam","702 Birch","kailynw@gmail.com","864-279-1689",644964851,29);
      wellsFargo.newAccountBusinessSavings("Russel","702 Birch","kailynw@gmail.com","864-279-1689",644964851,56569);
      wellsFargo.newAccountPersonalChecking("Williams","702 Birch","kailynw@gmail.com","864-279-1689",3,7239);

      wellsFargo.addIntrest();
      wellsFargo.applyfee();
      wellsFargo.closeAccount(86213);
        System.out.println();

      wellsFargo.printAccountData();






    }
}
