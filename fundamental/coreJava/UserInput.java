import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("welcome to a user input");
        Scanner input=new Scanner(System.in);
        System.out.print("enter the first number:");
        int a=input.nextInt();
        System.out.print("enter the second number:");
        int b=input.nextInt();

        int c=a+b;
        System.out.print("two numbers add:"+c);
    }
}