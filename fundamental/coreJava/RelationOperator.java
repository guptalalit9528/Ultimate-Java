package coreJava;

import java.util.Scanner;

public class RelationOperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to drivine license portal");
        System.out.println("enter the your age:");
        int age =sc.nextInt();

        System.out.println("------------------------------------------------------------------------------------");
                int a = 10, b = 20;
                System.out.println(a == b);  // false
                System.out.println(a != b);  // true
                System.out.println(a > b);   // false
                System.out.println(a < b);   // true
                System.out.println(a >= 10); // true
                System.out.println(b <= 20); // true
        System.out.println("------------------------------------------------------------------------------");

        if(age>=18) {
            System.out.print("your are eligible driving");
        }
            else{
                System.out.print("beta ji ghar betho");
            }
        }
    }

