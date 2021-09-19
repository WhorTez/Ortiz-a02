/*
 *   UCF COP3330 Fall 2021 Assignment 2
 *   Copyright 2021 Duane Ortiz
 */
package exercise18;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

/*
    Prompt user for starting temp to be Fahrenheit or Celsius
    If user chooses to start with fahrenheit convert to celsius
    If user chooses to start with celsius convert to fahrenheit
 */
public class Solution18 {
    private static final Scanner in = new Scanner(System.in);
    private String tempUnit;
    private int temp;
    private double newTemp;

    public String inputTempUnit() {
        System.out.print("Press 'C' to convert from Fahrenheit to Celsius");
        System.out.println("\nPress 'F' to convert from Celsius to Fahrenheit");
        String temp = in.next();
        return temp.toUpperCase(Locale.ROOT);
    }
    public int inputTemp(String tempUnit) {
        if (Objects.equals(tempUnit, "C")) {
            System.out.print("Enter the current temperature in Fahrenheit: ");
            return in.nextInt();
        } else if (Objects.equals(tempUnit, "F")) {
            System.out.print("Enter the current temperature in Celsius: ");
            return in.nextInt();
        }
        return 0;
    }
    public double convertCelsiusToFahrenheit(int temp) {
        return (temp * 9.0 / 5.0) + 32.0;
    }
    public double convertFahrenheitToCelsius(int temp) {
        return (temp - 32.0) * 5.0 / 9.0;
    }
    public static void main(String[] args){
        Solution18 s = new Solution18();
        s.tempUnit = s.inputTempUnit();
        s.temp = s.inputTemp(s.tempUnit);

        if(Objects.equals(s.tempUnit, "F")){
            s.newTemp = s.convertCelsiusToFahrenheit(s.temp);
            System.out.printf("The temperature is %.2f degrees Fahrenheit.", s.newTemp);
        }else if(Objects.equals(s.tempUnit, "C")){
            s.newTemp = s.convertFahrenheitToCelsius(s.temp);
            System.out.printf("The temperature is %.2f degrees Celsius.", s.newTemp);
        }else{
            System.out.printf("Invalid input please choose one of the two options. ");
        }
    }
}
