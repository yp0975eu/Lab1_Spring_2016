package com.branden;

import java.util.Scanner;

/*
 Ask your user to enter a sentence.  Use String library functions to:

 •	Display the user's sentence in uppercase,
 •	Display the sentence again, but in all lowercase,
 •	With all of the i characters replaced by !
 •	And with all the a characters replaced by @

 */
public class AdvancedProblem3 {
    static void run(){
        Scanner scan = new Scanner( System.in );
        System.out.println("Enter a sentence.");
        String sentence = scan.nextLine();
        // uppercase
        System.out.println(sentence.toUpperCase());
        // lowercase
        System.out.println(sentence.toLowerCase());
        /// replaced i with ! and a with @
        // replace returns a new string
        sentence = sentence.replace('i', '!');
        System.out.println(sentence.replace('a', '@') );

    }
}
