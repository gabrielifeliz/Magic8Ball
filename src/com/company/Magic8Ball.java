package com.company;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rnd = new Random();

        output("HELLO THERE! Ask a question to the MAGIC 8-BALL...");
        String question = keyboard.nextLine();

        int answerOption = 1 + rnd.nextInt(20);
        String magic8BallAnswer = "";

        switch (answerOption) {
            case 1:
                magic8BallAnswer = "It is certain";
                break;
            case 2:
                magic8BallAnswer = "It is decidedly so";
                break;
            case 3:
                magic8BallAnswer = "Without a doubt";
                break;
            case 4:
                magic8BallAnswer = "Yes definitely";
                break;
            case 5:
                magic8BallAnswer = "You may rely on it";
                break;
            case 6:
                magic8BallAnswer = "As I see it, yes";
                break;
            case 7:
                magic8BallAnswer = "Most likely";
                break;
            case 8:
                magic8BallAnswer = "Outlook good";
                break;
            case 9:
                magic8BallAnswer = "Yes";
                break;
            case 10:
                magic8BallAnswer = "Signs point to yes";
                break;
            case 11:
                magic8BallAnswer = "Reply hazy try again";
                break;
            case 12:
                magic8BallAnswer = "Ask again later";
                break;
            case 13:
                magic8BallAnswer = "Better not tell you now";
                break;
            case 14:
                magic8BallAnswer = "Cannot predict now";
                break;
            case 15:
                magic8BallAnswer = "Concentrate and ask again";
                break;
            case 16:
                magic8BallAnswer = "Don't count on it";
                break;
            case 17:
                magic8BallAnswer = "My reply is no";
                break;
            case 18:
                magic8BallAnswer = "My sources say no";
                break;
            case 19:
                magic8BallAnswer = "Outlook not so good";
                break;
            case 20:
                magic8BallAnswer = "Very doubtful";
        }

        output("");
        output("YOU ASKED: " + question);
        output("MAGIC 8-BALL SAYS: " + magic8BallAnswer);
        output("Do you have another question for the Magic 8-Ball? (y/n)");
        String choice = keyboard.next();

        while (choice.equalsIgnoreCase("y")) {
            output("");
            output("What's your question?");
            keyboard.nextLine();
            question = keyboard.nextLine();

            output("YOU ASKED: " + question);
            output("MAGIC 8-BALL SAYS: " + magic8BallAnswer);
            output("Do you have another question for the Magic 8-Ball? (y/n)");
            choice = keyboard.next();
        }


        output("\nGOOD BYE! See you next time");
    }

    public static void output(String message) {
        System.out.println(message);
    }
}
