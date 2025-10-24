package coreJava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println("welcome to prime number");
        Scanner input=new Scanner(System.in);
        System .out.print("please enter a number:");
        int number=input.nextInt();

        boolean isPrime=true;

        for (int i=2;i<number/2;i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Humara number prime number  hai");
        }else  {
            System.out.println("Humara number prime number nahi hai");
        }
    }
}
