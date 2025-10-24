package coreJava;

import java.util.Scanner;

public class ReturDemo {
    public static void main(String[] args) {
        greet();
        int first=inpNum()+4;
        int second=inpNum()+6;

        int sum=first+second;
        System.out.println("sum of two number="+sum);
    }



    public static int inpNum(){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number=");
        int number=input.nextInt();
        return number;
    }



      public static void greet(){
          System.out.println("welcome the the add two number");
      }
    }
