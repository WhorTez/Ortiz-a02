/*
*   UCF COP3330 Fall 2021 Assignment 2
*   Copyright 2021 Duane Ortiz
 */
package exercise13;


import java.util.Scanner;

public class Solution13 {
    /*
        Prompt user for principal amount
        Get interest rate from user
        Get number of years from user
        Get compound frequency from user
        Print output
     */

    private static final Scanner in = new Scanner(System.in);
    private int p;
    private int years;
    private int compoundFrequency;
    private double interest;
    private double totalAmount;

    public int initialInvestmentInput() {
        System.out.println("Enter is your initial investment: ");
        return in.nextInt();
    }
    public int years() {
        System.out.println("Enter the number of years: ");
        return in.nextInt();
    }
    public double interestRate() {
        System.out.println("Enter the interest rate: ");
        return in.nextDouble() / 100;
    }
    public int compoundFreq(){
        System.out.println("Enter the number of times the interest will be compounded per year:  ");
        return in.nextInt();
    }
    public double calcFinalAmount(int initialInvestmentInput,int years,double interestRate, int compoundFrequency){
        return p * Math.pow((1 + (interest / compoundFrequency)),(years * compoundFrequency));
    }

    public static void main(String[] args){
        Solution13 s = new Solution13();

        s.p = s.initialInvestmentInput();

        s.years = s.years();

        s.interest = s.interestRate();

        s.compoundFrequency = s.compoundFreq();

        s.totalAmount = s.calcFinalAmount(s.p, s.years, s.interest, s.compoundFrequency);
        System.out.printf("$%d invested at %.2f%% for %d years compounded %d times per year is $%.2f.", s.p, s.interest, s.years, s.compoundFrequency, s.totalAmount);
    }
}
