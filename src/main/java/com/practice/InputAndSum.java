package com.practice;

import java.util.Scanner;

public class InputAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sum of 2 number");
        System.out.print("enter the 1st number: ");
        int num1 = input.nextInt();
        System.out.print("enter the 2nd number");
        int num2 = input.nextInt();
        int result = num1 + num2;
        System.out.println("the result: "+result);
    }
}
