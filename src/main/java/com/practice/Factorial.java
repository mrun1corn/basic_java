package com.practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number : ");
        int fact = input.nextInt();
        int res = 1;
        for (int x=fact; x>=1; x--){
            res *= x;
                        
        }System.out.println("restul:"+ res);
    }

}
