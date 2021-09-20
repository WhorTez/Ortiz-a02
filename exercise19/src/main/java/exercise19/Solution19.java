/*
 *   UCF COP3330 Fall 2021 Assignment 2
 *   Copyright 2021 Duane Ortiz
 */
package exercise19;

import java.util.Scanner;

/*
    Prompt user for weight(lbs)
    Prompt user for height(in)
    If BMI is >= 18.5 and >= 25 display "You are within the weight range"
    If BMI is >= 25 display "You are overweight, consult a doctor"
    If BMI is <= 18.5 display "You are underweight, consult a doctor"
 */
public class Solution19 {
    private static final Scanner in = new Scanner(System.in);
    private double weight;
    private double height;
    private double BMI;

    public double getWeight(){
        System.out.print("Enter your weight in .lbs: ");
        if(in.hasNextDouble()){
            return in.nextInt();
        }else {
            in.next();
        }
        return getWeight();
    }
    public double getHeight(){
        System.out.print("Enter your height in inches: ");
        if(in.hasNextDouble()){
            return in.nextInt();
        }else {
            in.next();
        }
        return getHeight();
    }
    public double calcBMI(double weight, double height){
        return (weight / (height * height)) * 703.0;
    }
    public static void main(String[] args){
        Solution19 s = new Solution19();
        s.weight = s.getWeight();
        s.height = s.getHeight();
        s.BMI = s.calcBMI(s.weight, s.height);

        System.out.printf("Your BMI is %.2f%n", s.BMI);
        if(s.BMI > 25.0){
            System.out.print("You're on the heavier side buddy, might want to talk to your doctor.");
        }else if(s.BMI < 18.5){
            System.out.print("You're a bit underweight you should think about seeing a doctor. Grab something to eat while you're on the way.");
        }else {
            System.out.print("You're right where you need to be keep it up!");
        }
    }
}
