//create a program to check if a number is an armstrong number

package coreJava.Task;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("welcome to fibonaccis series");
        System.out.print("enter the num=");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        boolean isArmsStrong=isArmsStrong(num);
        if(isArmsStrong){
            System.out.println("your number is ArmsStrong");
        }else{
            System.out.println("your number is not ArmsStrong");
        }
    }

    public static boolean isArmsStrong(int num){
        int digits=noOfDigits(num);
        int numCopy=num;
        int finalNumber=0;
        while (num>0){
            int lastDigit=num%10;
            num/=10;
            finalNumber+=pow(lastDigit,digits);
        }
        return finalNumber==numCopy;
    }

    public static int pow(int num1,int num2){
        int result=1;
        int i=0;
        while(i<num2){
            result*=num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num){
        int digits=0;
        while(num>0){
            digits++;
            num/=10;
        }
        return digits;
    }
}
