package com.company;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rnd = new Random();

        output("HELLO THERE! Ask a question to the MAGIC 8-BALL...");
        String question = keyboard.nextLine();

        String[] magic8BallAnswers = {"It is certain", "It is decidedly so",
            "Without a doubt", "Yes definitely", "You may rely on it",
            "As I see it, yes", "Most likely", "Outlook good", "Yes",
            "Signs point to yes", "Reply hazy try again", "Ask again later",
            "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
            "Don't count on it", "My reply is no", "My sources say no",
            "Outlook not so good", "Very doubtful"};


        output("");
        output("YOU ASKED: " + question);
        output("MAGIC 8-BALL SAYS: " + magic8BallAnswers[0 + rnd.nextInt(19)]);
        output("Do you have another question for the Magic 8-Ball? (y/n)");
        String choice = keyboard.next();

        while (choice.equalsIgnoreCase("y")) {
            output("");
            output("What's your question?");
            keyboard.nextLine();
            question = keyboard.nextLine();

            output("YOU ASKED: " + question);
            output("MAGIC 8-BALL SAYS: " + magic8BallAnswers[0 + rnd.nextInt(19)]);
            output("Do you have another question for the Magic 8-Ball? (y/n)");
            choice = keyboard.next();
        }


        output("\nSee you next time. GOOD BYE!");
    }

    public static void output(String message) {
        System.out.println(message);
    }
}
