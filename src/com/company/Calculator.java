package com.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.println("Enter an operator (+, -, *, /):");
        char op = reader.next().charAt(0);


        switch (op) {
            case '+' -> ans = num1 + num2;
            case '-' -> ans = num1 - num2;
            case '*' -> ans = num1 * num2;
            case '/' -> ans = num1 / num2;
            default -> {
                System.out.println("Error! Enter correct operator");
                return;
            }
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
    }

}
