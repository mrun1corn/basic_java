package com.practice;
import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        //input method
        Scanner input = new Scanner(System.in);
        //data types
        double base, height;
        System.out.print("enter the base of triangle: ");
        base = input.nextDouble();
        System.err.print("enter the height of triangle: ");
        height = input.nextDouble();
        double area = 0.5 * base * height ;
        System.out.printf("Triangle area is %.2f",+area); 
    }

}
