package com.example.fractions;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int numerator = scanner.nextInt();
        System.out.println("Enter the denominator:");
        int denominator = scanner.nextInt();

        if (denominator == 0) {
            System.out.println("Denominator can't be zero.");
            System.exit(0);
        }

        if (numerator < denominator) {
            System.out.println("This is a proper fraction.");
        } else {
            System.out.println("This is an improper fraction.");
            int wholeNumber = numerator / denominator;
            int remainder = numerator % denominator;
            if (remainder != 0) {
                System.out.println("Mixed fraction: " + wholeNumber + " + " + remainder + " / " + denominator);
            } else {
                System.out.println("Integer: " + wholeNumber);
            }
        }
    }
}