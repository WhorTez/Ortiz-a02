/*
    UCF COP3330 Fall 2021 Assignment 2
    Copyright 2021 Duane_Ortiz
 */

import java.util.Scanner;
import java.util.Calendar;

public class Solution06 {
    /*
        Get user's  current age and the age of retirement
        Calculate remaining years until retirement
        Display the current year and year of expected retirement

     */
    public static void main(String[] args){

        System.out.printf("How old are you? ");
        Scanner current_Age = new Scanner(System.in);
        String age = current_Age.nextLine();
        int i = Integer.parseInt(age);

        System.out.printf("At what age are do you plan to retire? ");
        Scanner retire_Age = new Scanner(System.in);
        String retirement = retire_Age.nextLine();
        int n = Integer.parseInt(retirement);

        int result = (n-i);
        int year = Calendar.getInstance().get(Calendar.YEAR);



        System.out.println("You still have to tough it out for a few more years chief, you have " + result + " years left");
        System.out.println("The current year is " + year + ", looks like you are trying to retire in " + (year + result));

    }
}