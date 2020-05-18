package com.company;

import java.util.Scanner;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        if (this.tonerLevel == 0) {
            System.out.println("There is no ink. Refill toner cartridge");
            Scanner addInk = new Scanner(System.in);
            int inkLevel = addInk.nextInt();
            tonerLevel = tonerLevel + inkLevel;
            System.out.println("You have successfully filled toner with " + inkLevel + " ml of ink. Printer working. Please wait...");
        } else {
            System.out.println("Printer working. Please wait...");
        }
        this.pagesPrinted = pagesPrinted;

        this.duplex = duplex;
        if (duplex) {
            System.out.println("Would you like to print on both sides?");
            Scanner scanner = new Scanner (System.in);
            String agreement = scanner.next();
            if (agreement == "Yes" || agreement == "yes") {
               int duplexPrint = (pagesPrinted /2) + (pagesPrinted%2);
                System.out.println("Thank you for being eco :) You saved " + duplexPrint + "cards.");
            } else if (tonerLevel>0) {
                System.out.println("You have printed " + pagesPrinted + " pages.");
            }
    }


//    public int print(int printPrinted) {
//        int pagesToPrint = printPrinted;
//
//        if (this.duplex) {
//            System.out.println("Would you like to print on both sides?");
//            Scanner scanner = new Scanner(System.in);
//            String agreement = scanner.next();
//            if (agreement == "Yes" || agreement == "yes") {
//                int duplexPrint = (pagesPrinted / 2) + (pagesPrinted % 2);
//                System.out.println("Thank you for being eco :) You saved " + duplexPrint + "cards.");
//            }
//
//        }
//        return pagesToPrint;
    }
}