/*
 *   UCF COP3330 Fall 2021 Assignment 2
 *   Copyright 2021 Duane Ortiz
 */
package exercise14;

import java.util.Scanner;

/*
    Prompt user to enter order amount
    Prompt user for the state they are currently in
    Print out the subtotal
    Print out the tax amount
    Print out the total
 */
public class Solution14 {
    private static final Scanner in = new Scanner(System.in);
    private double orderAmount;
    private double tax;
    private double totalAmount;
    private String state;

    public double order(){
        System.out.print("Enter your order amount: ");
        return in.nextDouble();
    }
    public double calcTax(double orderAmount){
        return orderAmount * 0.055;
    }
    public String userState(){
        System.out.print("What state you are in: ");
        state = in.next();
        return state;
    }

    public static void main(String[] args){
        Solution14 s = new Solution14();
        s.orderAmount = s.order();
        s.state = s.userState();

        if(s.state.equals("WI")){
            s.tax = s.calcTax(s.orderAmount);
            s.totalAmount = s.tax + s.orderAmount;
        }

        s.orderAmount = Math.round(s.orderAmount * 100.0)/ 100.0;
        s.tax = Math.round(s.tax * 100.0)/ 100.0;
        s.totalAmount = Math.round(s.totalAmount * 100.0)/ 100.0;

        System.out.println(s.state.equals("WI") ? "Your subtotal is $"+ s.orderAmount +"\nThe tax is $"+ s.tax +"\n Your total amount is $"+ s.totalAmount: "Your total amount is $"+ s.orderAmount);
    }
}
