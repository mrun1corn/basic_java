package com.practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // data types
        String exp;
        double num1;
        double num2;
        // input's
        System.out.print("Enter the 1st number : ");
        num1 = input.nextDouble();
        System.out.print("Enter what you want to do (+, -, *, /): ");
        exp = input.next();
        System.out.print("Enter the second number : ");
        num2 = input.nextDouble();
        // math logic
        double sum = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double abs = num1 / num2;

        if (exp.equals("+")){
            System.out.print(" Your calculated valu : "+ sum);
        }
        else if (exp.equals("-")){
            System.out.print(" Your calculated valu : "+ sub);
        }
        else if (exp.equals("*")){
            System.out.print(" Your calculated valu : "+ mul);
        }
        else if (exp.equals("/")){
            System.out.print("Your calculated valu : "+ abs);
        }
        else{
            System.out.println("invalid aurgument");

        }
    }

}
