/*
 *   UCF COP3330 Fall 2021 Assignment 2
 *   Copyright 2021 Duane Ortiz
 */
package exercise17;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
    Prompt user for weight, gender, total alcohol consumed(ounces)
        and hours since last drink
    Calculate blood alcohol content
    If BAC is <= 0.08 user can drive
    If BAC is >= 0.08 user cannot drive
 */
public class Solution17 {
    private static final Scanner in = new Scanner(System.in);
    private int weight;
    private int gender;
    private int alcoholConsumed;
    private int timeSinceLastDrink;
    private double ratio;
    private static final double MALE_DISTRIBUTION_RATIO = 0.73;
    private static final double FEMALE_DISTRIBUTION_RATIO = 0.73;
    private double bac;

        public int userGender(){
        System.out.print("Enter a 1 if you are a male or enter 2 if you are a female: ");
        if(in.hasNextDouble()){
            return in.nextInt();
        }else {
            in.next();
        }
        return userGender();
    }
        public int userAlcConsumed(){
        System.out.print("How much alcohol have you drank already(oz)? ");
        if(in.hasNextDouble()){
            return in.nextInt();
        }else {
            in.next();
        }
        return userAlcConsumed();
    }
        public int userWeight(){
        System.out.print("How much do you weigh? ");
        if(in.hasNextDouble()){
            return in.nextInt();
        }else {
            in.next();
        }
        return userWeight();
        }
        public int userTimeSinceLastDrink(){
            System.out.print("How long has it been since your last drink(hours)? ");
            if(in.hasNextDouble()){
                return in.nextInt();
            }else {
                in.next();
            }
            return userTimeSinceLastDrink();
        }
        public double verifyGender(int gender){
            if(gender == 1){
                return MALE_DISTRIBUTION_RATIO;
            }else if(gender == 2){
                return FEMALE_DISTRIBUTION_RATIO;
            }else
                System.out.print("Listen choose 1 or 2 those are your only options.");
            userGender();
            return 0;
        }
        public double calcBac(int weight, double ratio, int alcoholConsumed, int timeSinceLastDrink){
            return (alcoholConsumed * 5.14/weight * ratio) - 0.015 * timeSinceLastDrink;
        }
        public static void main(String[] args){
            Solution17 s = new Solution17();

            s.gender = s.userGender();
            s.alcoholConsumed = s.userAlcConsumed();
            s.weight = s.userWeight();
            s.timeSinceLastDrink = s.userTimeSinceLastDrink();
            s.ratio = s.verifyGender(s.gender);
            s.bac = s.calcBac(s.weight, s.ratio, s.alcoholConsumed, s.timeSinceLastDrink);

            System.out.printf("Your blood-alcohol content is %f, ", s.bac);
            if(s.bac <= 0.08){
                System.out.print("You're pushing it but you can still drive.");
            }else{
                System.out.print("Get an uBer dude");
            }
        }
        }


