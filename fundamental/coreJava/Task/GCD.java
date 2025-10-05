//create a program to find the Greatest common divisor(Gcd) of  two integer

//package coreJava.Task;
//import java.util.Scanner;
//public class GCD {
//    public static void main(String[] args) {
//        System.out.println("enter the gcd number");
//        System.out.print("enter the first number=");
//        Scanner input=new Scanner(System.in);
//        int first=input.nextInt();
//        System.out.print("enter the second number=");
//        int second =input.nextInt();
//        int gcd=gcd(first,second);
//        System.out.println("GCD of the number is:"+gcd);
//    }
//
//    public static int gcd(int num1,int num2){
//        int gcd=1;
//        int i=2;
//        int least=least(num1,num2);
//        while(i<=num2){
//            if (num1%i==0&&num2%i==0){
//                gcd=i;
//            }
//            i++;
//        }
//        return gcd;
//    }
//
//
//    public static int least(int num1,int num2){
//        if(num1<num2){
//            return num1;
//        }else{
//            return num2;
//        }
//    }
//}



package coreJava.Task;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int gcd = 1;

        int least = (a < b) ? a : b;
        for (int i = 1; i <= least; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD = " + gcd);
    }
}
