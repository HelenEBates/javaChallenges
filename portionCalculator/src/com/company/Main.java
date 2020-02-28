package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// scanners to take input on number of adults and children
        System.out.println("Enter number of adults ");
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter number of children");
        Scanner scan2 = new Scanner(System.in);


        int numAdults = scan1.nextInt();
        int numKids = scan2.nextInt();

        int multiplyBy = numAdults + (numKids / 2);



        if (multiplyBy % 2 != 0) {
            System.out.println("Odd number of portions, enter 1 to add another portion so you can just double ingredients?");
            Scanner extra = new Scanner(System.in);
            int addExtra = extra.nextInt();
            if (addExtra == 1)
                multiplyBy++;
            System.out.print("Recipe will be calculated for " + multiplyBy);
        } else {
            System.out.print("Recipe will be calculated for " + multiplyBy);
        }
    }
}
