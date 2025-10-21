package coreJava;

import java.util.Scanner;

public class Bodmas {
    public static void main(String[] args) {
        System.out.println("welcome to bodmas use");
        Scanner input=new Scanner(System.in);
        System.out.print("enter the a value :");
        int a=input.nextInt();
        System.out.print("enter the a value :");
        int b=input.nextInt();
        System.out.print("enter the a value :");
        int c=input.nextInt();

        int d=a-b*c/a%b+a+a+b/c;
        System.out.println("the bodmas is:"+d);
    }
}
