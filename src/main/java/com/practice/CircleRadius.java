package com.practice;

import java.util.Scanner;

public class CircleRadius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.1416;
        double area;
        System.out.println("Enter the radius of the circle");
        double radius = input.nextDouble();
        area = pi * radius * radius;
        System.out.printf("The area of cirle is :%.2f", +area);
    }

}
