/*
    UCF COP3330 Fall 2021 Assignment 2
    Copyright 2021 Duane_Ortiz
 */
package exercise10;

import java.util.Scanner;

public class Solution10 {
/*
Prompt for price of item 1
Prompt for quantity of item 1


Prompt for price of item 2
Prompt for quantity of item 2

Prompt for price of item 3
Prompt for quantity of item 3

Calculate subtotal
Calculate tax

Print out subtotal, tax and finalTotal
 */


private static final Scanner in = new Scanner(System.in);
private static double subTotal = 0.00;
private double tax;
private double finalPrice;
private static final double TAX_RATE = 0.055;

    public static void input(){
        for (int i =1; i<=3; i++){
            System.out.printf("How much does item %d cost?  ", i);
            String itemPrice = in.nextLine();
            double price = Double.parseDouble((itemPrice));

            System.out.printf("How much of item %d will you be purchasing today? ", i);
            String itemQuantity = in.nextLine();
            int quantity = Integer.parseInt(itemQuantity);

            calcPrice(price, quantity);
        }
    }

    public static void calcPrice(double price, int quantity){
        subTotal += (price * quantity);
    }

    public double calcTax(double subTotal){
        tax = subTotal * TAX_RATE;
        return tax;
    }

    public double calcFinalPrice(){
        finalPrice = subTotal + tax;
        return finalPrice;
    }

public static void main(String[] args){
    Solution10 s = new Solution10();
    input();
    System.out.printf("Your subtotal is going  to be: $%.2f", subTotal);

    s.tax = s.calcTax(subTotal);
    System.out.printf("%nTax: $%.2f",s.tax);

    s.finalPrice = s.calcFinalPrice();
    System.out.printf("%nYour total will be: $%.2f", s.finalPrice);



}


}
