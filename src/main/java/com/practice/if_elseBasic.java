package com.practice;

import java.util.Scanner;

public class if_elseBasic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 0 to 9 to view spelling: ");
        Short num = input.nextShort();
        if (num == 0) {
            System.out.print("Zeor");
        }
        else if (num == 1) {
            System.out.print("One");
        }
        else if (num == 2) {
            System.out.print("Tow");
        }
        else if (num == 3) {
            System.out.print("Three");
        }
        else if (num == 4) {
            System.out.print("Four");
        }
        else if (num == 5) {
            System.out.print("Five");
        }
        else if (num == 6) {
            System.out.print("Six");
        }
        else if (num == 7) {
            System.out.print("Seven");
        }
        else if (num == 8) {
            System.out.print("Eight");
        }
        else if (num == 9) {
            System.out.print("Nine");
        }
        else{
            System.out.print("Invalid number.");
        }
    }

}
