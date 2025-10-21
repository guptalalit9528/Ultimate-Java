package coreJava;

import java.util.Scanner;

public class AnyTable1ToAny {
    public static void main(String[] args) {
        System.out.println("welcome the the 1 to any number");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number:");

        int number = input.nextInt();
        int i = 1;
        while (i <= 10) {
            String space = " ";
            int j = 1;
            while (j <= number) {
                System.out.printf("%d * %d = %-4d", j, i, j * i); // %-4d aligns the columns
                if (i > 0 && j < number) {
                    System.out.print("           " + space); // Extra spacing between columns
                }
                else {
                    if(j == number){
                        System.out.print("         "); // Extra spacing between columns
                    } else {
                        System.out.print("           "); // Extra spacing between columns
                    }
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
