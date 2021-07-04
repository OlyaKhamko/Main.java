package com.company;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {

    private static Object Currensy;

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Введите код валюты (USD,EUR,RUB): ");
            String kod1 = scan.nextLine();

            Scanner scan1 = new Scanner(System.in);
            System.out.print("Введите сумму в BYN: ");
            int sum = scan1.nextInt();
            Currensy[] Cur = new Currensy[3];
            Currensy USD = new Currensy();
            Currensy EURO = new Currensy();
            Currensy RUB = new Currensy();
            USD.code = "USD";
            EURO.code = "EURO";
            RUB.code = "RUB";
            USD.rate = 0.398;
            EURO.rate = 0.313;
            RUB.rate = 3.3;
            Cur[0] = USD;
            Cur[1] = EURO;
            Cur[2] = RUB;


            double result = 0.0;
            String name = "";

            for (int i = 0; i < Cur.length; i++) {
                if (kod1.equals(Cur[i].code)){
                    result = sum * Cur[i].rate;
                    System.out.println(result + "" + name);
                    break;}
            }

        }
    }

