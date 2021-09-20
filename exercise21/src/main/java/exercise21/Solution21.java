/*
 *   UCF COP3330 Fall 2021 Assignment 2
 *   Copyright 2021 Duane Ortiz
 */
package exercise21;

import java.util.Scanner;

/*
    Prompt user for a number 1-12
    Convert number to its month using switch cases
    print name of month according to the number inputted
 */
public class Solution21 {
    private static final Scanner in = new Scanner(System.in);
    private String monthString;
    private int month;

    public int inputMonth(){
        System.out.print("Enter a number 1-12: ");
        return in.nextInt();
    }
    public String numberToMonthName(int month){
        switch(month){
            case 1: monthString = "January";
            break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid input.";
                break;
        }
        return monthString;
    }
    public static void main(String[] args){
        Solution21 s = new Solution21();
        s.month = s.inputMonth();
        s.monthString = s.numberToMonthName(s.month);

        System.out.printf("The name of the month is %s.", s.monthString);
    }
}
