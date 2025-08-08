package com.aurionpro.test;

import java.util.Scanner;

public class WordGuesserApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String word = "Rucha";
        int n = word.length();

        char[] blanks = new char[n];
        for (int i = 0; i < n; i++) {
            blanks[i] = '-';
            System.out.print(blanks[i]);
        }

        int lives = n;
        boolean found = false;

        System.out.println("\nGuess a letter:");

        while (lives > 0) {
            String guessedInput = scanner.next();
          
            found = false;

            for (int j = 0; j < n; j++) {
                
                if (guessedInput.equalsIgnoreCase(String.valueOf(word.charAt(j))) && blanks[j] == '-') {
                    blanks[j] = word.charAt(j);
                    found = true;
                }
            }

            if (!found) {
                lives--;
                System.out.println("Wrong guess! Lives left: " + lives);
            }

            // Print current state
            for (int i = 0; i < n; i++) {
                System.out.print(blanks[i]);
            }
            System.out.println();

            // Check if word is fully guessed
            boolean allblanksFilled = true;
            for (int i = 0; i < n; i++) {
                if (blanks[i] == '-') {
                    allblanksFilled = false;
                    break;
                }
            }

            if (allblanksFilled) {
                System.out.println("Congratulations! You guessed the word: " + word);
                break;
            }

            if (lives == 0) {
                System.out.println("Game Over! The word was: " + word);
                break;
            }

            System.out.println("Guess a letter:");
        }

        scanner.close();
	}

}
