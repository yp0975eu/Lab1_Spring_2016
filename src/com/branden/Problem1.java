package com.branden;

import java.util.Scanner;

/*
Once the user has typed in their response,
display "you live more than 10 miles from MCTC" if they live more than 10 miles away,
And, display "you live exactly 10 miles from MCTC" if they live exactly 10 miles away,
And, display "you live less than 10 miles from MCTC" if they live less than 10 miles away.
Use if – else if – else statements.
*/

public class Problem1 {

     static void run() {
        int distance;
        System.out.println("How may miles do you live from MCTC");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Please enter a number");
            scan.next();
        }
        distance = scan.nextInt();
        if (distance > 10) {
            System.out.println("You live more than 10 miles away.");
        } else if (distance < 10) {
            System.out.println("You live less than 10 miles away.");
        } else {
            System.out.println("You live exactly than 10 miles away.");
        }
        scan.close();

     }
}
