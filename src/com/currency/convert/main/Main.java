package com.currency.convert.main;

import com.currency.convert.calculator.Calculator;
import com.currency.convert.models.ConsultCoins;
import com.currency.convert.records.Currency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Class scanner instance
        Scanner scanner = new Scanner(System.in);
        //Class ConsulCoins scanner instance
        ConsultCoins myCoins = new ConsultCoins();
        Calculator calculating = new Calculator();

        double result;
        double ammount;

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
                    ammount = scanner.nextInt();
                    //Pass parameter to consulting API
                    Currency trade1 = myCoins.showTrade("USD", "ARS");
                    //Catch the conversion. Using the conversion between base and target currency plus mount inserted
                    result = calculating.makeCalculation(ammount, trade1.conversion_rate());
                    System.out.println(calculating.showMss(trade1, ammount, result));
                    break;
                case 2:
                    //Show message to receive mound to convert
                    System.out.println(amountMss);
                    //Received mound
                    ammount = scanner.nextInt();
                    //Pass parameter to consulting API
                    Currency trade2 = myCoins.showTrade("DOP", "USD");
                    //Catch the conversion. Using the conversion between base and target currency plus mount inserted
                    result = calculating.makeCalculation(ammount, trade2.conversion_rate());
                    System.out.println(calculating.showMss(trade2, ammount, result));
                    break;
                case 3:
                    //Show message to receive mound to convert
                    System.out.println(amountMss);
                    //Received mound
                    ammount = scanner.nextInt();
                    //Pass parameter to consulting API
                    Currency trade3 = myCoins.showTrade("USD", "MXN");
                    //Catch the conversion. Using the conversion between base and target currency plus mount inserted
                    result = calculating.makeCalculation(ammount, trade3.conversion_rate());
                    System.out.println(calculating.showMss(trade3, ammount, result));
                    break;
                case 4:
                    //Show message to receive mound to convert
                    System.out.println(amountMss);
                    //Received mound
                    ammount = scanner.nextInt();
                    //Pass parameter to consulting API
                    Currency trade4 = myCoins.showTrade("USD", "BRL");
                    //Catch the conversion. Using the conversion between base and target currency plus mount inserted
                    result = calculating.makeCalculation(ammount, trade4.conversion_rate());
                    System.out.println(calculating.showMss(trade4, ammount, result));
                    break;
                case 5:
                    //Show message to receive mound to convert
                    System.out.println(amountMss);
                    //Received mound
                    ammount = scanner.nextInt();
                    //Pass parameter to consulting API
                    Currency trade5 = myCoins.showTrade("USD", "GBP");
                    //Catch the conversion. Using the conversion between base and target currency plus mount inserted
                    result = calculating.makeCalculation(ammount, trade5.conversion_rate());
                    System.out.println(calculating.showMss(trade5, ammount, result));
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
