package com.practice;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char word;
        System.out.print("Enter any Word : ");
        word = input.next().charAt(0);
        if(word == 'a' || word == 'A'){
            System.out.print("Vowel");
        }
        else if (word == 'e' || word == 'E'){
            System.out.print("Vowel");
        }
        else if(word == 'i' || word == 'I'){
            System.out.print("Vowel");
        }
        else if(word == 'o' || word == 'O'){
            System.out.print("Vowel");
        }
        else if(word == 'u' || word == 'U'){
            System.out.print("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }

}
