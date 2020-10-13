package com.company;
import  java.util.Scanner;
public class ArithmeticGame {
    public static void start(){
        Scanner input = new Scanner(System.in);
        int x,y,ans;
        boolean check = true;
        while (check){
             x = (int)(10*Math.random());
             y = (int)(10*Math.random());
             System.out.printf("What is %d+%d=?\n",x,y);
             ans = input.nextInt();
            if (ans == x + y) {
                System.out.println("You are correct");
            } else {
                System.out.println("You are INCORRECT");
            }
            System.out.println("Enter true to CONTINUE otherwise 0");
            check = input.nextBoolean();


        }
    }
}
