/*
    UCF COP3330 Fall 2021 Assignment 2
    Copyright 2021 Duane_Ortiz
 */
package exercise11;

import java.util.Scanner;

/*
    Prompt user for amount of money in euros
    Prompt for current exchange rate of euro to US dollar
    Print out amount in US dollars
 */
public class Solution11 {

    private static final Scanner in = new Scanner(System.in);
    private float usDollar;
    private static float euro;
    private static float rate;

private static void input(){
    System.out.printf("How many euros are you exchanging? ");
    String input1 = in.nextLine();
    euro = Float.parseFloat(input1);

    System.out.printf("What is the exchange rate? ");
    String input2 = in.nextLine();
    rate = Float.parseFloat(input2);

}
private float calcConversion(){
    usDollar = euro * rate;
    return usDollar;
}
private static void output(double usDollar){
    System.out.printf("%.2f euros at an exchange rate of %f is %n equal to %.2f U.S dollars.", euro, rate, usDollar);
}
public static void main(String[] args) {
Solution11 s = new Solution11();
input();
s.usDollar = s.calcConversion();
output(s.usDollar);
}
}
