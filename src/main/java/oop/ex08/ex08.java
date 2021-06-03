/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 08 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex08;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args)
    {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("How many people? ");
        int totalPeople = userInputScanner.nextInt();
        System.out.print("How many pizzas do you have? ");
        int totalPizzas = userInputScanner.nextInt();
        System.out.print("How many slices per pizza? ");
        int slicesPerPizza = userInputScanner.nextInt();
        int totalSlices = slicesPerPizza * totalPizzas;

        int piecesPerPerson = totalSlices / totalPeople;
        int piecesLeftOver = totalSlices % totalPeople;

        System.out.print(totalPeople + " people with " + totalPizzas + " pizzas (" + totalSlices + " slices)\nEach person gets "
        + piecesPerPerson +" pieces of pizza.\nThere are " + piecesLeftOver + " leftover pieces.");
    }
}
