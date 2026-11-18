
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();

        if (principal < 0 || rate < 0 || time < 0) {
            System.out.println("Invalid input!");
            sc.close();
            return;
        }

        double simpleInterest =
                (principal * rate * time) / 100;

        System.out.println("Simple Interest: Rs. " + simpleInterest);

        double totalAmount = principal + simpleInterest;

        System.out.println("Total Amount: Rs. " + totalAmount);

        sc.close();
    }
}
