package com.company;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args){

        double [] valueOfCurrency = {0.39, 0.33, 28.77};
        String [] nameOfCurrency = {"USD", "EURO", "RUB"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму в BYN: ");
        int number = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Выберите валюту (dollar, euro, rubel): ");
        String type = sc2.nextLine();

        double result = 0.0;
        String finalResult = "";

        for (int i = 0; i < valueOfCurrency.length; i++){
            if (nameOfCurrency.equals(nameOfCurrency[i])){
                result = number * valueOfCurrency[i];
                finalResult = nameOfCurrency[i];

                System.out.println(result + " " + finalResult);
            }
        }

    }
    }

