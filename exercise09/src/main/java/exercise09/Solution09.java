/*
    UCF COP3330 Fall 2021 Assignment 2
    Copyright 2021 Duane_Ortiz
 */
package exercise09;

import java.util.Scanner;

public class Solution09 {
    /*
    Prompt user for length and width of ceiling
    Calculate area
    Determine how many gallons of paint are needed
     */

    public static void main(String[] args){
        double areaCoveredPerGallon = 350;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the length of the ceiling: ");
        double length = s.nextDouble();

        System.out.print("Enter the width of the ceiling: ");
        double width = s.nextDouble();

        double totalArea = length * width;
        int paintGallon = (int)Math.ceil(totalArea/areaCoveredPerGallon);

        System.out.print("To cover a ceiling of "+ totalArea +" square feet you'll have to purchase "+ paintGallon +" gallons of paint.");
    }
}
