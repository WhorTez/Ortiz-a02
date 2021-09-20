/*
 *   UCF COP3330 Fall 2021 Assignment 2
 *   Copyright 2021 Duane Ortiz
 */
package exercise22;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
/*
    Prompt user for 3 numbers
    Check to see all numbers are different
    If not exit program
    If so display the largest number
 */
public class Solution22 {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;
    private int tempNumber;
    private static final Scanner in = new Scanner(System.in);

    public int getFirstNumber() {
        System.out.print("Enter a number: ");
        return in.nextInt();
    }
    public int getSecondNumber() {
        System.out.print("Enter a second number: ");
        return in.nextInt();
    }
    public int getThirdNumber() {
        System.out.print("Enter a third number: ");
        return in.nextInt();
    }
    public static void main(String[] args){
        Solution22 s = new Solution22();
        s.firstNumber = s.getFirstNumber();
        s.secondNumber = s.getSecondNumber();
        s.thirdNumber = s.getThirdNumber();

        if(s.firstNumber == s.secondNumber || s.firstNumber == s.thirdNumber || s.secondNumber == s.thirdNumber){
            System.out.print("Looks like two or more numbers are the same, try entering 3 different numbers this time.");
            System.exit(0);

        }else {
            if(s.firstNumber > s.secondNumber){
                if(s.firstNumber > s.thirdNumber){
                    s.tempNumber = s.firstNumber;

                }else{
                    s.tempNumber = s.thirdNumber;
                }

            }else if(s.secondNumber > s.thirdNumber){
                s.tempNumber = s.secondNumber;
            }else{
                s.tempNumber = s.thirdNumber;
            }
        }
        System.out.printf("The largest number is %d", s.tempNumber);
    }
}
