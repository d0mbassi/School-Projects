package com.example.school;
import java.util.Scanner;

public class school {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // initialize max and count
        long max = input.nextLong();
        int count = (max != 0) ? 1 : 0;

        while (true) {
            long number = input.nextLong();
            if (number == 0) {
                break;
            }
            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The largest number is " + max);
            System.out.println("The occurrence count of the largest number is " + count);
        } else {
            System.out.println("No numbers are entered except 0");
        }
    }
}
