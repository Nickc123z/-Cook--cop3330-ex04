/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Nick Cook
 */

import java.util.Scanner;



public class E4 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a noun");
        String string = input.nextLine();

        Scanner input1 = new Scanner (System.in);
        System.out.println("Enter a verb");
        String string1 = input1.nextLine();

        Scanner input2 = new Scanner (System.in);
        System.out.println("Enter an adjective");
        String string2 = input2.nextLine();

        Scanner input3 = new Scanner (System.in);
        System.out.println("Enter an adverb");
        String string3 = input3.nextLine();


        System.out.println("Do you " + string1 + " your " + string2 + " " + string + " " +  string3 +"? "+ "that's hilarious");


    }
}