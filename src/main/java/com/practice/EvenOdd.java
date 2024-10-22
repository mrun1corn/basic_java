package com.practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int x = num % 2;
        if (x == 0) {
            System.out.println("print number is even");
                        
        }
        else{
            System.out.print("numer is odd");
        }
    }

}
