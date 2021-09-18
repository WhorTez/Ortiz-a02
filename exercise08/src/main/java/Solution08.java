import java.util.Scanner;

/*
    UCF COP3330 Fall 2021 Assignment 2
    Copyright 2021 Duane_Ortiz
 */
public class Solution08 {
    /*
        Prompt for amountOfPeople
        Prompt for amountOfPizza
        Prompt for slicesPerPizza
        Display slicersPerPeople and any leftovers
     */
    public static void main(String[] args){

        Scanner p = new Scanner(System.in);
        System.out.print("This program will evenly divide slices of pizza between a group of people.\n");

        System.out.print("How many people will be attending the party? ");
        int friends = p.nextInt();

        System.out.print("How many pizzas will you be getting? ");
        int pizza = p.nextInt();

        System.out.print("How many slices does each pizza have? ");
        int slices = p.nextInt();

        int totalSlices = slices * pizza;

        System.out.print("Lets say you have "+ friends +" friends show up and you get "+ pizza +" pizzas, you'll have "+
                            totalSlices +" slices to split between all of you. \n");

        if(totalSlices/friends == 1){
            System.out.println("Everyone will get "+ totalSlices/friends +" slices with no slices leftover");
        }else{
            System.out.print("Everyone will get "+ totalSlices/friends +" slices with "+ (totalSlices%friends) +" slices leftover");
        }

    }
}
