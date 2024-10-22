package com.practice;

import java.util.Scanner;

public class GenerateFrom_mTo_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        System.out.print("input the 1st num: ");
        int num1 = input.nextInt();
        System.out.print("input the 2nd num: ");
        int num2 = input.nextInt();
        
        for (int x=num1; x<=num2; x++){
            int sum=0, r, temp;
            temp =x;
            while(temp!=0){ //sum of digits logic start
                r = temp %10;
                sum = sum + r*r*r;
                temp=temp/10;
            }/*sum of digits logic end */
            if (x == sum){
                System.out.println("result : "+ x);
            }
            

        }
    }

}
