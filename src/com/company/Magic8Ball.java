package com.company;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {

        // Create Scanner object to read input from user
        Scanner keyboard = new Scanner(System.in);
        // Create Random object to generate random numbers
        Random rnd = new Random();

        // Create a String array to hold all the possible answers from the Magic 8-Ball
        String[] magic8BallAnswers = {"It is certain", "It is decidedly so",
                "Without a doubt", "Yes definitely", "You may rely on it",
                "As I see it, yes", "Most likely", "Outlook good", "Yes",
                "Signs point to yes", "Reply hazy try again", "Ask again later",
                "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
                "Don't count on it", "My reply is no", "My sources say no",
                "Outlook not so good", "Very doubtful"};

        // Prompt user for first question to the Magic 8-Ball and receive it
        output("HELLO THERE! Ask a question to the MAGIC 8-BALL...");
        String question = keyboard.nextLine();

        output("");
        // Display first question from user
        output("YOU ASKED: " + question);
        /* Display random answer from Magic 8-Ball,
            accessing the String array with possible index from 0 to 19 */
        output("MAGIC 8-BALL SAYS: " + magic8BallAnswers[rnd.nextInt(19)]);
        // Prompt user for continuing asking question to the Magic 8-Ball and receive answer
        output("Do you have another question for the Magic 8-Ball? (y/n)");
        String choice = keyboard.next();

        /* Enter the while loop if user enters "Y" or "y"
            Otherwise, skip it */
        while (choice.equalsIgnoreCase("y")) {
            output("");
            // Prompt user for other questions and receive them
            output("What's your question?");
            keyboard.nextLine();  // Clean up any extra newline character (\n)
            question = keyboard.nextLine();

            // Display other questions from user
            output("YOU ASKED: " + question);
            // Display random answers from Magic 8-Ball
            output("MAGIC 8-BALL SAYS: " + magic8BallAnswers[rnd.nextInt(19)]);
            // Prompt user for continuing asking question to the Magic 8-Ball and receive answer again
            output("Do you have another question for the Magic 8-Ball? (y/n)");
            choice = keyboard.next();

            // while loop ends when user enters "N" or "n", which is not equal to "Y" or "y"
        }

        // End the program with a nice goodbye message to the user
        output("\nThank you for participating. See you next time. GOOD BYE!");

        // Close Scanner object to stop receiving inputs
        keyboard.close();
    }

    // This method displays any String message that is passed as an argument when called in the main method
    public static void output(String message) {
        System.out.println(message);
    }
}
