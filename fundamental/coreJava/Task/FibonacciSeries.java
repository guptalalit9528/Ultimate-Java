//create a program to print fibonaccis series up to a certain number


package coreJava.Task;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("welcome to fibonaccis series");
        System.out.print("enter the num=");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println("here is the fibonacci series");
        printFibonacci(num);
    }
    public static void printFibonacci(int num){
    if(num<0) return;
        System.out.print("0 ");
        if(num==0) return;
        System.out.print("1 ");

        int first=0,second=1;
        while(first+second<=num){
            int third =first + second;
            System.out.print(third+ " ");
            first=second;
            second=third;
        }

    }
}
