/*
 *   UCF COP3330 Fall 2021 Assignment 2
 *   Copyright 2021 Duane Ortiz
 */
package exercise15;

import java.util.Scanner;

/*
    Prompt user for a username and password
    Program should compare password given by user to a known password
    If password matches, display "Welcome!"
    If password doesn't match display "I don't know you"
 */
public class Solution15 {
    private static final Scanner in = new Scanner(System.in);
    private static final String SYSTEM_PASSWORD = "CLBwasBETTERthanDONDA";
    private String userName;
    private String password;

    public String inputUsername(){
        System.out.print("Enter username/login: ");
        return in.next();
    }
    public String inputPassword(){
        System.out.print("Enter password: ");
        return in.next();
    }
    public boolean verifyPassword(String password, String systemPassword){
        return password.equals(systemPassword);
    }

    public static void main(String[] args){
        Solution15 s = new Solution15();
        s.userName = s.inputUsername();
        s.password = s.inputPassword();

        if(s.verifyPassword(s.password, SYSTEM_PASSWORD)){
            System.out.print("CONGRATS, you remembered your password, come on in!");
        }else {
            System.out.print("Hey it's okay to forget stuff, but not right now. Try again or beat it!");
        }
    }
}
