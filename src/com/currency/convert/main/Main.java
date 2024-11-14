package com.currency.convert.main;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ConsultCoins myCoins = new ConsultCoins();

        String mss = """
                1) Dollar to Argentine peso
                2) Dominican peso to Dollar
                3) Dollar to Mexican peso
                4) Dollar to Brazilian real
                5) Dollar to British pounds
                6) Exit
                """;
        //Show Menu
        System.out.println(mss);

        int options = scanner.nextInt();

        switch (options) {
            case 1:
                    Currentcy trade1 = myCoins.showTrade("USD", "DOP");
                    System.out.println(trade1);

                break;
            case 2:
                Currentcy trade2 = myCoins.showTrade("USD", "ARS");
                System.out.println(trade2);

                break;
            case 3:
                break;


        }

        scanner.close();

    }
}
