package coreJava;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        int myAge;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        myAge = sc.nextInt();
        if (myAge < 18) {
            System.out.println("You are too young");
        }  else if (myAge > 18 && myAge < 25) {
            System.out.println("You are too young");
        } else if (myAge > 25 && myAge < 35) {
            System.out.println("You are too young");
        }  else if (myAge > 35) {
            System.out.println("You are too young");
        }
    }
}
