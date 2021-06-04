/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
import java.util.Scanner;

public class Main {
    public static final double TAX = 0.055;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount?");
        int n = in.nextInt();
        in.nextLine();
        System.out.print("What is the state?");
        String state = in.nextLine();
        double total = n;
        if (state.equals("WI")) {
            System.out.printf("The tax is $%.2f\n", total * TAX);
            total += total * TAX;
        }
        System.out.printf("The total is $%.2f.\n", total);
    }
}