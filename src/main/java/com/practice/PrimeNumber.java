package com.practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number");
        int x = input.nextInt();
        int prime = 0;
        if (x==0 || x==1){
            System.out.print("its not prime number");
        }
        else {
            for (int n=2; n<x; n++){
                if(x%n == 0);
                prime++;
                break;
            }
            if(prime==0 ){
                System.out.println("Number is prime");
            }
            else{
                System.out.println("Number is not prime");
            }
            
        }
    }

}
