/*
 *   UCF COP3330 Fall 2021 Assignment 2
 *   Copyright 2021 Duane Ortiz
 */
package exercise20;
/*
    Prompt user for order amount
    Prompt user for state they live in
    Prompt user for county they live in
    Display tax amount and total amount
 */

import java.util.Objects;
import java.util.Scanner;

public class Solution20 {
    private static double WISalesTax = 0.05;
    private static final double EAU_CLAIRE_COUNTY_TAX = 0.005;
    private static final double DUNN_COUNTY_TAX = 0.004;
    private static final double IL_SALES_TAX = 0.08;
    private static final Scanner in = new Scanner(System.in);
    private double orderAmount;
    private double tax;
    private double totalAmount;
    private String state;
    private String county;

    public double order() {
        System.out.print("Enter your order amount: ");
        return in.nextDouble();
    }
    public double calcTax(double orderAmount, double taxRate){
        return orderAmount * taxRate;
    }
    public String userState() {
        System.out.print("What state you are in: ");
        state = in.next();
        return state;
    }
    public String WICounty() {
        System.out.print("What county are you in? ");
        return in.next();
    }
    public static void main(String[] args){
        Solution20 s = new Solution20();
        s.orderAmount = s.order();
        s.state = s.userState();

        if(Objects.equals(s.state, "Wisconsin")){
            s.county = s.WICounty();

            if(Objects.equals(s.county, "Eau Claire County")){
                WISalesTax += EAU_CLAIRE_COUNTY_TAX;

            }else if(Objects.equals(s.county, "Dunn County")){
                WISalesTax += DUNN_COUNTY_TAX;
            }
            s.tax = s.calcTax(s.orderAmount, WISalesTax);
            s.totalAmount = s.tax + s.orderAmount;

        }else if(Objects.equals(s.state, "Illinois")){
            s.tax = s.calcTax(s.orderAmount, IL_SALES_TAX);
            s.totalAmount = s.tax + s.orderAmount;
        }

        s.orderAmount = Math.round(s.orderAmount * 100.0)/ 100.0;
        s.tax = Math.round(s.tax * 100.0)/ 100.0;
        s.totalAmount = Math.round(s.totalAmount * 100.0)/ 100.0;

        System.out.println(Objects.equals(s.state, "Wisconsin") || Objects.equals(s.state, "Illinois")? "Your subtotal is $"+ s.orderAmount +
                "\nThe tax is $"+ s.tax + "\nYour total amount due is $"+ s.totalAmount : "Your total amount due is $"+ s.totalAmount);
    }

}