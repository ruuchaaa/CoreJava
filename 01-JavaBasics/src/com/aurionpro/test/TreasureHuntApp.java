package com.aurionpro.test;

import java.util.Scanner;

public class TreasureHuntApp {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Treasure Hunt Game. Your mission is to find the treasure.");

        System.out.println("Where do you want to go left or right:");
        String choice1 = scanner.next();

        if (choice1.equalsIgnoreCase("left")) {

            System.out.println("Type 'wait' to wait for a boat or 'swim' to swim across:");
            String choice2 = scanner.next();

            if (choice2.equalsIgnoreCase("wait")) {

               System.out.println("There is a house with 3 doors. One red, one yellow, and one blue. Which color do you choose?");
               String door = scanner.next();
               switch (door) {
                    case "red":
                        System.out.println(" Game Over.");
                        break;
                    case "blue":
                        System.out.println("Game Over.");
                        break;
                    case "yellow":
                        System.out.println("You found the treasure! You Win!");
                        break;
                    default:
                        System.out.println("Game Over.");
                }

            } else {
                System.out.println("Game Over.");
            }

        } else {
            System.out.println("Game Over.");
        }

       
    }
}
