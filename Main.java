package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int dec=0b00001000;

        Scanner scan = new Scanner(System.in);
        System.out.println("wybierz:");
        System.out.print("dziesiec, trzy, szesnascie: ");

         String s = scan.next();

        switch(s) {
            case "dziesiec":
                decNumber liczba = new decNumber();
                liczba.number10 = dec;
                liczba.convert();
                break;
            case "trzy":
                trioNumber liczba3 = new trioNumber();
                liczba3.number3 = dec;
                liczba3.convert();
                //System.out.println(Integer.toString(dec,3));
                break;

            case "szesnascie":

                hexNumber liczba16 = new hexNumber();
                liczba16.number16 = dec;
                liczba16.convert();
                break;

            default:
                System.out.println("zle wybrales !!!");
        }
    }
}
