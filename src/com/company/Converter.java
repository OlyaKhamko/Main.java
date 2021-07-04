package com.company;

import java.util.Scanner;

public class Converter {
        public static void main(String[] args) {

            System.out.println("Вас приветствует конвертор валют! Для конвертации белорусских рублей необходимо выбрать валюту.");
            System.out.println("Пожалуйста, введите цифру в соответствии с номером валюты:");
            System.out.println("1 - EUR");
            System.out.println("2 - USD");

            Scanner scanner = new Scanner(System.in);
            int toCurrency = scanner.nextInt();
            if (toCurrency != 1 && toCurrency != 2) {
                System.out.println("Введена некорретная цифра валюты. Пожалуйста, перезапустите программу.");
                return;
            }
            System.out.println("Пожалуйста, введите сумму в белорусских рублях для последующей конвертации:");
            double BYN = scanner.nextDouble();

            double eurExchangeRate = 3.03;
            double usdExchangeRate = 2.54;

            double result = 0;

            switch (toCurrency) {
                case 1 -> result = BYN / eurExchangeRate;
                case 2 -> result = BYN / usdExchangeRate;
                default -> System.out.println("Вы ввели некорректную сумму. Пожалуйста, попробуйте снова.");
            }
            System.out.println("Сумма в валюте составит: " + Math.floor(result));
        }
    }

