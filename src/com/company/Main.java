package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        // write your code here
//double f = 0;
//        int counter = 0,number = 0,largest = 0 ;
//        System.out.println("Enter any number to find its Maximum: ");
//    System.out.printf("%,2f\n",0.33333f);
//        System.out.println((2+1000)%7);
//        System.out.println("Enter a Temperature in a Farenheit:");
//        f = input.nextDouble();
//        System.out.printf("Celcius: %.2f\n", TemperatureConverter.convertToCelcius(f));
//System.out.println(CurrentTime.getUTCTime());
//        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1-0.1);
//        System.out.println(1.0-0.6);

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size(dimension) of the vector that is to be created::");
//        int size = sc.nextInt();
//        double[] uVector = new double[size];
//        double[] vVector = new double[size];
//        System.out.println("Enter the elements of the vector::");
//
//        for (int i = 0; i < size; i++) {
//            uVector[i] = sc.nextDouble();
//        }
//        System.out.println("Enter the elements of the second vector::");
//        for (int i = 0; i < size; i++) {
//            vVector[i] = sc.nextDouble();
//        }
//        CouchySchwarzTheoremChecker instance = new CouchySchwarzTheoremChecker();
//        instance.showElements(uVector,vVector);
//        instance.checkCSHTheorem(uVector,vVector);
////
//int var = sc.nextInt();
//if (var > 0){
//    System.out.println("The number "+ var + " is positive");
//}
//else if(var == 0) {
//    System.out.println("The number " + var + " is zero");
//}
//else
//{
//    System.out.println("The number " + var + " is NEGATIVE");
//}
//        ArithmeticGame obje = new ArithmeticGame();
//        obje.start();
//    ChineseZodiac zod = new ChineseZodiac();
//    zod.zodiac();
        GuessNumberGame numberGame = new GuessNumberGame();
        numberGame.start();

    }
}