package com.branden;

/*
Problem 3: Sales Tax
Write a program that asks the user for

•	The name of a product
•	The price of that product
•	The sales tax rate of that product
Your program should calculate and display the name and the total price of the item including sales tax.
For example, a widget costs $10, and sales tax is 7%. The total price of the widget iis $10.70.
*/

import java.util.Scanner;

public class Problem3 {
    static void run(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the name of the product.");
        String name = scan.nextLine();
        double price, tax;
        System.out.println("What is the price");
        while( !scan.hasNextDouble() ){
            System.out.println("Please enter a price with cents. xx.xx ");
            scan.next();
        }
        price = scan.nextDouble();


        System.out.println("What is the tax rate");
        while( !scan.hasNextDouble() ){
            System.out.println("Please enter a tax with decimals");
            scan.next();
        }
        tax = scan.nextDouble();
        System.out.printf("A %s costs $%.2f, and sales tax is %.2f The total price of the widget is $%.2f\n", name, price, tax,  price *= (1 + tax/100) );

        scan.close();

    }
}
