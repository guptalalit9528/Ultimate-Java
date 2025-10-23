package coreJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        int age = 20;
        int marks = 85;

        // AND operator
        System.out.println(age > 18 && marks > 50);

        // OR operator
        System.out.println(age > 18 || marks < 40);

        // NOT operator
        System.out.println(!(age > 18));

        System.out.println("-------------------------------------------------------------------------");

        Scanner input = new Scanner (System.in);
        System.out.println("welcome to ticket discount calculate");
        System.out.print("please enter your age");
        int Age=input.nextInt();
        System.out.println("are you a female. true /false");
        boolean isFemale=input.nextBoolean();

        if(Age<=18){
            System.out.println("you got a 50% discount");
        }else if(age>=70&&isFemale)
        {
            System.out.println("you got 90% discount");
        }
        else if(isFemale){
            System.out.println("you got only 70% discount");
        }else{
            System.out.println("you are a chile so uou got discount only 20%");
        }

    }
}



