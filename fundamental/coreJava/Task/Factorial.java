//write a function that calculates the factorial of a given number

package coreJava.Task;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("write the factorial ");
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number=");
        int num=sc.nextInt() ;
        long fact=factorial(num);
        System.out.println("Factorial="+fact);
    }

    public static long factorial(int num) {
        if (num<2){
            return 1;
        }
        long fact = 1;
        for(int i=2; i<= num ; i++) {
            fact= fact*i;

        }
        return fact;

    }
}



//this is a easy factorial problem
//package coreJava.Task;
//import java.util.Scanner;

//public class Factorial {
//    public static void main(String[] args) {
//        System.out.println("write the factorial ");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("please enter the number=");
//        long num = sc.nextLong();
//        long fact = 1;
//        int i = 1;
//        while( i <= num ) {
//            fact = fact * i;
//            System.out.println(i);
//            i++;
//        }
//            System.out.println( "factroial="+fact);
//    }
//}
