package coreJava;

import java.util.Scanner;

public class PrimeManager {
    public static void main(String[] args) {
        //Generate prime nnumber logic with different method isPrime
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if (number < 1) {
            System.out.println("Invalid input");
        } else  {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
