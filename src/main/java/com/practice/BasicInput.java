package com.practice;
import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number = ");
        int num = input.nextInt();
        System.out.print("Your inputed Number= " + num);
    }

    
}
