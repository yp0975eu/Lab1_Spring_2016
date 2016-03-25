package com.branden;

import java.util.Scanner;

/*
 Java is to JavaScript as Car is to …. what?
 Write a quiz program that asks the user this question, and tests if their answer is correct.
 (Check slide 7 of this week's slides if you don't know).
 Your program should accept a correct answer in uppercase, lowercase or any combination.
 You should use the equals() or equalsIgnoreCase() methods to compare Strings.
 Using == with Strings tends to result in odd behavior.
 */
public class AdvancedProblem1 {
    static void run(){
        Scanner scan = new Scanner(System.in);
        String answer;
        System.out.println("Java is to JavaScript as Car is to …. what?");
        answer = scan.nextLine();
        if ( answer.equalsIgnoreCase("carpet") ){
            System.out.println("You are correct!");
        } else {
            System.out.println("Sorry, that's not right");
        }
        scan.close();
    }
}
