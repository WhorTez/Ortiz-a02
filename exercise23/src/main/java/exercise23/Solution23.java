/*
 *   UCF COP3330 Fall 2021 Assignment 2
 *   Copyright 2021 Duane Ortiz
 */
package exercise23;

import java.util.Objects;
import java.util.Scanner;

public class Solution23 {
    private static final Scanner in = new Scanner(System.in);
    private String answer;

    public String userInput(){
        return in.nextLine();
    }
    public static void main(String[] args) {
        Solution23 s = new Solution23();

        System.out.println("Only answer the following questions in 'Y' or 'N'");
        System.out.println("Is the car silent when you turn the key?");
        s.answer = s.userInput();

        if (Objects.equals(s.answer, "Y")) {
            System.out.print("Pop the hood and check if battery terminals are loose/ corroded?");
            s.answer = s.userInput();

            if (Objects.equals(s.answer, "Y")) {
                System.out.println("Clean the terminals and try starting again");
            } else {
                System.out.println("Replace cables and try again");
            }
        } else {
            System.out.print("Does the car make a slicking noise?");
            s.answer = s.userInput();

            if (Objects.equals(s.answer, "Y")) {
                System.out.println("Replace the battery");
            } else {
                System.out.println("Does the car crank up but fail to start?");
                s.answer = s.userInput();

                if (Objects.equals(s.answer, "Y")) {
                    System.out.println("Check spark plug connection");
                } else {
                    System.out.println("Does the engine start then die? ");
                    s.answer = s.userInput();

                    if (Objects.equals(s.answer, "Y")) {
                        System.out.println("Does the car have fuel injection?");
                        s.answer = s.userInput();

                        if (Objects.equals(s.answer, "Y")) {
                            System.out.println("Take it in for service");
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing");
                        }
                    } else {
                        System.out.println("This should not be possible");
                    }
                }
            }
        }
    }
}
