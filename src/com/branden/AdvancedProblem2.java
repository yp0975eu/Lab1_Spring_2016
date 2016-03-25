package com.branden;

import java.util.Scanner;

/*
 Conditional statements. Here’s some code from today's PowerPoint:

 String sentence = "I'm a sentence";
 if (sentence.endsWith(".") == false) {
 System.out.println("A sentence should end with a . ");
 }

 Modify this code so it prints a different message if the sentence does end with the correct character.

 But a sentence can also end with a ! or a ?.
 Please modify your program so it does not print an error message for sentences which end with ? or !

 -	Write two versions – one should use a single if statement with either && or || to test all conditions in one single if statement.

 -	The second version should use an if, else if, structure to check each character in turn.

 */
public class AdvancedProblem2 {
    static void run() {
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter a sentence.");
        String sentence = scan.nextLine();

        // version 1
        if (sentence.endsWith(".") || sentence.endsWith("?") || sentence.endsWith("!")) {

            System.out.println("Your sentence ends with punctuation.");

        } else {

            System.out.println("A sentence should end with a punctuation ");

        }

        // version 2
        if ( sentence.endsWith(".")){

            System.out.println("Your sentence ends with a period.");

        } else if (sentence.endsWith("?")) {

            System.out.println("Your sentence ends with a question.");

        } else if ( sentence.endsWith("!")) {

            System.out.println("Your sentence ends with exclamation.");

        } else {

            System.out.println("Your sentence doesn't end with punctuation.");
        }
    }
}
