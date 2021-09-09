package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter the price of item 1: " );
        int item1 = input.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int item1Quantity = input.nextInt();
        System.out.print("Enter the price of item 2:  ");
        int item2 = input.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int item2Quantity = input.nextInt();
        System.out.print("Enter the price of item 3: ");
        int item3 = input.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int item3Quantity = input.nextInt();

        double subtotal = (item1 * item1Quantity) + (item2 * item2Quantity) + (item3 * item3Quantity);
        System.out.println("Subtotal: $" + subtotal);
        double tax = subtotal * 0.05;
        System.out.println("Tax: $" + tax);
        double total = subtotal + tax;
        System.out.println("Total: $" + total);
    }
}
