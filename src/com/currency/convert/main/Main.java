package com.currency.convert.main;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Class scanner instance
        Scanner scanner = new Scanner(System.in);
        //Class ConsulCoins scanner instance
        ConsultCoins myCoins = new ConsultCoins();

        boolean running = true;
        while (running) {
            //Menu of options
            String mss = """
                    1) Dollar to Argentine peso
                    2) Dominican peso to Dollar
                    3) Dollar to Mexican peso
                    4) Dollar to Brazilian real
                    5) Dollar to British pounds
                    6) Exit
                    """;
            String amountMss = "Insert the ammount derised to conver";
            //Show Menu
            System.out.println(mss);

            int options = scanner.nextInt();
            switch (options) {
                case 1:
                    //Show message to receive mound to convert
                    System.out.println(amountMss);
                    //Received mound
                    double ammount = scanner.nextInt();
                    //Pass parameter to consulting API
                    Currentcy trade1 = myCoins.showTrade("USD", "ARS");
                    //Catch the conversion. Using the conversion between base and target currency plus mount inserted
                    double ammountConverted = ammount * trade1.conversion_rate();
                    //Show the balance of the two currency and the resul of the conversion mound
                    System.out.println(trade1 + " The ammount " + ammount + " converted is " + ammountConverted + " USD");
                    break;
                case 2:
                    System.out.println(amountMss);
                    double ammount2 = scanner.nextInt();
                    Currentcy trade2 = myCoins.showTrade("DOP", "USD");
                    double result2 = ammount2 * trade2.conversion_rate();
                    System.out.println(trade2 + "The ammount converted is " + result2);
                    break;
                case 3:
                    System.out.println(amountMss);
                    double ammount3 = scanner.nextInt();
                    Currentcy trade3 = myCoins.showTrade("USD", "MXN");
                    double result3 = ammount3 * trade3.conversion_rate();
                    System.out.println(trade3 + "The ammount converted is " + result3);
                    break;
                case 4:
                    System.out.println(amountMss);
                    double ammount4 = scanner.nextInt();
                    Currentcy trade4 = myCoins.showTrade("USD", "BRL");
                    double result4 = ammount4 * trade4.conversion_rate();
                    System.out.println(trade4 + "The ammount converted is " + result4);
                    break;
                case 5:
                    System.out.println(amountMss);
                    double ammount5 = scanner.nextInt();
                    Currentcy trade5 = myCoins.showTrade("USD", "GBP");
                    double result5 = ammount5 * trade5.conversion_rate();
                    System.out.println(trade5 + "The ammount converted is " + result5);
                    break;
                case 6:
                    running = false;
                    break;
            }
        }
        System.out.println("Program closed!");
        scanner.close();
    }
}
