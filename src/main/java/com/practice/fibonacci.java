package com.practice;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the last number of you want the value : ");
        int z = input.nextInt();
        int num1 = 0, num2 = 1;
        System.out.print( " "+num1+" "+num2);

        for(int x=2; x<z; x++){
            int y = num1 + num2;
            System.out.print(" "+y);
            num1 = num2;
            num2 = y;
        }
    }


}
