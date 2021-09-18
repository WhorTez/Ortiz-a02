/*
    UCF COP3330 Fall 2021 Assignment 2
    Copyright 2021 Duane_Ortiz
 */


import java.util.Scanner;

/*
    Get size of room from user in feet
    Calculate area of room with given input
   Display size of room in both square feet and meters
 */
public class Solution07 {

    public static void main(String[] args){

        System.out.print("This program will calculate the area of a rectangular room.\n" +
                          "Enter the length of the room: ");
        Scanner length = new Scanner(System.in);
        String lengthString = length.nextLine();
        double l = Double.parseDouble(lengthString);

        System.out.print("Enter the width of the room: ");
        Scanner width = new Scanner(System.in);
        String widthString = width.nextLine();
        double w = Double.parseDouble(widthString);

        System.out.print("According to your input, the room you are measuring is " + l + " feet long and "
                          + w + " feet wide\n");

        double areaFeet = l * w;
        double C = areaFeet * 0.09290304;
        double areaMeter = C;

        System.out.print("The area of the room is: \n" + areaFeet + " square feet \n" + areaMeter + " square meters");

    }

}
