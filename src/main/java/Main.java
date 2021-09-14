/*
* UCF COP 3330 Fall 2021 Assignment 3 Solution
* Copyright 2021 Rahel Haque
 */


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("What is the quote?");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();
        System.out.println("Who said it?");
        String author = input.nextLine();
        System.out.printf(" %s says, \"%s\" ", author, quote);
    }
}
