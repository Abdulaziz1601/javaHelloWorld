package com.company;
import java.util.Scanner;
public class ChineseZodiac {
    public  static void zodiac()
    { int year =0, remainder = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year to find zodiac animal");
        year = input.nextInt();
        remainder  = year%12;
        switch (remainder)
        {
            case 0: System.out.println("Your year is Monkey");break;
            case 1: System.out.println("Your year is Rooster");break;
            case 2: System.out.println("Your year is Dog");break;
            case 3: System.out.println("Your year is Pig");break;
            case 4: System.out.println("Your year is Rat");break;
            case 5: System.out.println("Your year is Ox");break;
            case 6: System.out.println("Your year is Tiger");break;
            case 7: System.out.println("Your year is Rabbit");break;
            case 8: System.out.println("Your year is Dragon");break;
            case 9: System.out.println("Your year is Snake");break;
            case 10: System.out.println("Your year is Horse");break;
            case 11: System.out.println("Your year is Sheep");break;
            default:System.out.println("Error");


        }
    }
}
