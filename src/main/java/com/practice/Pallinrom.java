package com.practice;

import java.util.Scanner;

public class Pallinrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0, r, temp;
        System.out.print("Input a number: ");
        int num = input.nextInt();
        temp = num;
        while(temp != 0){
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        if(num == sum){
            System.out.println("number is pallindrom");
        }
        else{
            System.out.println("not pallindrom");
        }
    }

}
