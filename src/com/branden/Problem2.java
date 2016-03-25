package com.branden;

import java.util.Scanner;

/*
To install Windows 10, you require
Either Windows 7  OR  Windows 8
1 GHz or greater processor
2 GB or more RAM
Write a program that asks the user for the current version of their operating system,
the CPU speed, and amount of RAM
Use && and || in conditions to display a message telling the user if they are able to install Windows 10
*/

public class Problem2 {
    static void run(){
        String windowsVersion;
        double cpu;
        int ram;
        Scanner scan = new Scanner( System.in );

        System.out.println("Enter your Windows version");
        windowsVersion = scan.nextLine();
        System.out.println("Enter your CPU speed");
        while ( !scan.hasNextDouble() ) {
            System.out.println("Please enter a number with with decimal");
        }
        cpu = scan.nextDouble();
        System.out.println("Please enter your ram in gigs");
        while ( !scan.hasNextInt() ) {
            System.out.println("Please enter your ram in gigs");
        }
        ram = scan.nextInt();

        if ( ram > 2 && cpu > 1.0 && windowsVersion.equalsIgnoreCase("7") || windowsVersion.equalsIgnoreCase("8")){
            System.out.println("You can install Windows 10");
        } else {
            System.out.println("You can't install Windows 10");
        }

        scan.close();
    }

}
