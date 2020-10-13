package com.company;

import java.util.Scanner;

public class GuessNumberGame {
    public static void start() {
        Scanner input = new Scanner(System.in);
        int randomNumber = 0, guess = 0, numberOfTries = 0;
        boolean stop = true;
        randomNumber = (int) (100 * Math.random() + 1);
        System.out.println("Enter any number to guess and find the random number::");
        while (stop){
            guess = input.nextInt();
            if (guess>randomNumber)
            {
                System.out.printf("Your random number is less than guess %d  \n",guess);




            }
            else if(guess<randomNumber)
            {
                System.out.printf("Your random number is more than guess %d  \n",guess);
            }
            else if(randomNumber == guess  )
            {
                System.out.printf("Congrats!!!, Random Number is %d and Guess is %d\n You have tried %d times",randomNumber,guess, numberOfTries);
                stop = false;
            }
            numberOfTries++;

        }


    }
}
