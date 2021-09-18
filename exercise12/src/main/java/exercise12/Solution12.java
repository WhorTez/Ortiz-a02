/*
    UCF COP3330 Fall 2021 Assignment 2
    Copyright 2021 Duane_Ortiz
 */
package exercise12;

import java.util.Scanner;
/*
    Prompt user for input of principal
    Prompt user for input of interest rate
    Prompt user for length of time in years
    Calculate amount at end of investment

 */
public class Solution12 {

    private static final Scanner in = new Scanner(System.in);
    private int p;
    private int years;
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
    public double calcFinalAmount(int initialInvestmentInput, double interestRate, int years){
        return initialInvestmentInput() * (1 + (interestRate() * years()));
            }

            public static void main(String[] args){
        Solution12 s = new Solution12();

        s.p = s.initialInvestmentInput();

        s.years = s.years();

        s.interest = s.interestRate();

        s.totalAmount = s.calcFinalAmount(s.p, s.interest, s.years);
        System.out.printf("After %d years at %.2f%%, your investment is going to be worth $%.2f.", s.years, s.interest, s.totalAmount);
            }
}
