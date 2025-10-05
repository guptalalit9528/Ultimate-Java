//create a program that shows BITWISE AND of two number

package coreJava.Task;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to the BETWISE OPERATOR");
        System.out.print("enter the first number=");
        int num1=sc.nextInt();
        System.out.print("enter the second number=");
        int num2=sc.nextInt();

        System.out.println("this  is a end operator="+(num1&num2));
        System.out.println("this  is a or operator="+(num1|num2));
        System.out.println("this  is a xor operator="+(num1^num2));
        System.out.println("this  is a compliment operator="+(~num1));
        System.out.println("this  is a left shift operator="+(num2<<1));
        System.out.println("this  is a right shift operator="+(1>>num2));
    }
}
