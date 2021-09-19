/*
 *   UCF COP3330 Fall 2021 Assignment 2
 *   Copyright 2021 Duane Ortiz
 */
package exercise16;

import java.util.Scanner;

/*
Prompt user for current age
If user is sixteen or older display "You are old enough to legally drive"
If user is under sixteen display "You are not old enough to legally drive"
 */
public class Solution16 {
    private static final Scanner in = new Scanner(System.in);
    private static final int LEGAL_DRIVING_AGE = 16;
    private int userAge;

    public int getUserAge(){
        System.out.print("How old are you? ");
        return in.nextInt();
    }

    public void printLegalAge(int userAge){
        System.out.print(LEGAL_DRIVING_AGE <= userAge ? "Congrats you can legally drive!" : "You may know how to drive but the law says you can't. ");
    }
    public static void main(String[] args){
        Solution16 s = new Solution16();
        s.userAge = s.getUserAge();
        s.printLegalAge(s.userAge);
    }
}
